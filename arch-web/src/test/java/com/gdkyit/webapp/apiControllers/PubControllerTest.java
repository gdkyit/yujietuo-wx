package com.gdkyit.webapp.apiControllers;

import com.alibaba.druid.filter.config.ConfigTools;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import org.apache.commons.codec.binary.Base64OutputStream;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.util.Base64;
import java.util.Optional;
import java.util.Properties;

import static org.junit.Assert.*;

public class PubControllerTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void genBase64String(){
        try {
//            ConfigTools.main(new String[]{"aaa"});
           /* byte[][] keyPairBytes = new byte[2][];
            KeyPairGenerator gen = KeyPairGenerator.getInstance("RSA", "SunRsaSign");
            gen.initialize(512, new SecureRandom());
            KeyPair pair = gen.generateKeyPair();
            keyPairBytes[0] = pair.getPrivate().getEncoded();
            keyPairBytes[1] = pair.getPublic().getEncoded();
            String[] keyPairs = new String[]{com.alibaba.druid.util.Base64.byteArrayToBase64(keyPairBytes[0]), Base64.byteArrayToBase64(keyPairBytes[1])};
            System.out.println(keyPairs[0]);*/

            SecureRandom random = new SecureRandom();
            byte[] ba1 = random.generateSeed(16);
            String salt = Base64.getEncoder().encodeToString(ba1);

            System.out.println(salt);
        }catch (Exception e){
            e.printStackTrace();
//            Mu6dowzPMQ8M6WZCDbiQrKg96hY=
        }


    }

}