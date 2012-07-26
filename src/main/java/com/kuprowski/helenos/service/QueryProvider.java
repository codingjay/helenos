/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kuprowski.helenos.service;

import com.googlecode.jsonrpc4j.JsonRpcParam;
import java.util.UUID;

/**
 * ********************************************************
 * Copyright: 2012 Tomek Kuprowski
 *
 * License: GPLv2: http://www.gnu.org/licences/gpl.html
 *
 * @author Tomek Kuprowski (tomekkuprowski at gmail dot com)
 * *******************************************************
 */
public interface QueryProvider {
    
    String get(@JsonRpcParam("cf") String columnFamily,@JsonRpcParam("uuidKey") UUID key,@JsonRpcParam("column") String column);
    String get(@JsonRpcParam("cf") String columnFamily,@JsonRpcParam("stringKey") String key,@JsonRpcParam("column") String column);
}