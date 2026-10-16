package org.apache.tika.pipes.fetcher;

import java.io.IOException;
import java.io.InputStream;
import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;

/* loaded from: classes5.dex */
public interface RangeFetcher extends Fetcher {
    InputStream fetch(String str, long j8, long j10, Metadata metadata) throws TikaException, IOException;

    InputStream fetch(String str, long j8, long j10, Metadata metadata, ParseContext parseContext) throws TikaException, IOException;
}
