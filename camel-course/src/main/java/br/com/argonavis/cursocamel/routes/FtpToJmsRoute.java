/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.argonavis.cursocamel.routes;

import br.com.argonavis.cursocamel.Configuration;
import br.com.argonavis.cursocamel.components.LoggingProcessor;
import org.apache.camel.builder.RouteBuilder;

/**
 *
 * @author helderdarocha
 */
public class FtpToJmsRoute extends RouteBuilder {

        String filaDeCoisas2 = "jms:filaDeCoisas2";

        @Override
        public void configure() throws Exception {
            this.from(Configuration.FTP_URL)
                   .process(new LoggingProcessor()) 
                   .to(filaDeCoisas2);
        }
    }