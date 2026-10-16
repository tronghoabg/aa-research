package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.TSFBuilder;
import com.fasterxml.jackson.core.io.InputDecorator;
import com.fasterxml.jackson.core.io.OutputDecorator;
import com.fasterxml.jackson.core.util.BufferRecycler;
import com.fasterxml.jackson.core.util.JsonGeneratorDecorator;
import com.fasterxml.jackson.core.util.JsonRecyclerPools;
import com.fasterxml.jackson.core.util.RecyclerPool;
import java.util.ArrayList;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class TSFBuilder<F extends JsonFactory, B extends TSFBuilder<F, B>> {
    protected ErrorReportConfiguration _errorReportConfiguration;
    protected int _factoryFeatures;
    protected List<JsonGeneratorDecorator> _generatorDecorators;
    protected InputDecorator _inputDecorator;
    protected OutputDecorator _outputDecorator;
    protected RecyclerPool<BufferRecycler> _recyclerPool;
    protected StreamReadConstraints _streamReadConstraints;
    protected int _streamReadFeatures;
    protected StreamWriteConstraints _streamWriteConstraints;
    protected int _streamWriteFeatures;
    protected static final int DEFAULT_FACTORY_FEATURE_FLAGS = JsonFactory.Feature.collectDefaults();
    protected static final int DEFAULT_PARSER_FEATURE_FLAGS = JsonParser.Feature.collectDefaults();
    protected static final int DEFAULT_GENERATOR_FEATURE_FLAGS = JsonGenerator.Feature.collectDefaults();

    protected TSFBuilder(int i2, int i3, int i4) {
        this._recyclerPool = JsonRecyclerPools.defaultPool();
        this._factoryFeatures = i2;
        this._streamReadFeatures = i3;
        this._streamWriteFeatures = i4;
        this._inputDecorator = null;
        this._outputDecorator = null;
        this._streamReadConstraints = StreamReadConstraints.defaults();
        this._streamWriteConstraints = StreamWriteConstraints.defaults();
        this._errorReportConfiguration = ErrorReportConfiguration.defaults();
        this._generatorDecorators = null;
    }

    protected static <T> List<T> _copy(List<T> list) {
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    protected TSFBuilder() {
        this(DEFAULT_FACTORY_FEATURE_FLAGS, DEFAULT_PARSER_FEATURE_FLAGS, DEFAULT_GENERATOR_FEATURE_FLAGS);
    }

    protected TSFBuilder(JsonFactory jsonFactory) {
        this(jsonFactory._factoryFeatures, jsonFactory._parserFeatures, jsonFactory._generatorFeatures);
        this._inputDecorator = jsonFactory._inputDecorator;
        this._outputDecorator = jsonFactory._outputDecorator;
        this._streamReadConstraints = jsonFactory._streamReadConstraints;
        this._streamWriteConstraints = jsonFactory._streamWriteConstraints;
        this._errorReportConfiguration = jsonFactory._errorReportConfiguration;
        this._generatorDecorators = _copy(jsonFactory._generatorDecorators);
    }
}
