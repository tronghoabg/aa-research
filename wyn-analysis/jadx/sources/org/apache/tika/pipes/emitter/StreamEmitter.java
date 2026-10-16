package org.apache.tika.pipes.emitter;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: classes5.dex */
public interface StreamEmitter extends Emitter {
    void emit(String str, InputStream inputStream, Metadata metadata, ParseContext parseContext) throws TikaEmitterException, IOException;
}
