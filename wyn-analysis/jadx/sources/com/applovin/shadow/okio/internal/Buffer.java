package com.applovin.shadow.okio.internal;

import A7.AbstractC0279p0;
import R8.v;
import Va.M6;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.C1681SegmentedByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Segment;
import com.applovin.shadow.okio.SegmentPool;
import com.applovin.shadow.okio.SegmentedByteString;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.applovin.shadow.okio.Utf8;
import com.applovin.shadow.okio._JvmPlatformKt;
import com.vungle.ads.internal.protos.Sdk;
import ff.m;
import java.io.EOFException;
import java.io.IOException;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.pipes.PipesConfigBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pd.f;
import tf.p;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\u001a7\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0014\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a,\u0010\u0019\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0014\u0010\u001b\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0014\u0010\u001e\u001a\u00020\u001d*\u00020\u000bH\u0080\b¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0014\u0010!\u001a\u00020 *\u00020\u000bH\u0080\b¢\u0006\u0004\b!\u0010\"\u001a\u0014\u0010#\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010%\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\b%\u0010\u001c\u001a\u001c\u0010'\u001a\u00020\u001d*\u00020\u000b2\u0006\u0010&\u001a\u00020\fH\u0080\b¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010*\u001a\u00020)*\u00020\u000bH\u0080\b¢\u0006\u0004\b*\u0010+\u001a\u001c\u0010,\u001a\u00020)*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b,\u0010-\u001a0\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b0\u00101\u001a\u001c\u00103\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\b3\u00104\u001a\u001c\u00105\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\b5\u00104\u001a\u001c\u00107\u001a\u00020\u0000*\u00020\u000b2\u0006\u00106\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b7\u00108\u001a\u001c\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b0\u0010:\u001a,\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b0\u0010;\u001a\u0014\u0010<\u001a\u00020\u0004*\u00020\u000bH\u0080\b¢\u0006\u0004\b<\u0010=\u001a\u001c\u0010<\u001a\u00020\u0004*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b<\u0010>\u001a\u001c\u0010@\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\b@\u0010A\u001a\u001c\u0010B\u001a\u00020)*\u00020\u000b2\u0006\u0010?\u001a\u00020\u0004H\u0080\b¢\u0006\u0004\bB\u0010C\u001a,\u0010@\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010?\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b@\u0010D\u001a\u0014\u0010E\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bE\u0010\u001c\u001a\u0014\u0010F\u001a\u00020\f*\u00020\u000bH\u0080\b¢\u0006\u0004\bF\u0010\u001c\u001a\u0014\u0010G\u001a\u00020.*\u00020\u000bH\u0080\b¢\u0006\u0004\bG\u0010H\u001a\u001c\u0010G\u001a\u00020.*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bG\u0010I\u001a\u001c\u0010J\u001a\u00020\u0002*\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b¢\u0006\u0004\bJ\u0010K\u001a$\u0010B\u001a\u00020)*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bB\u0010L\u001a\u001c\u0010N\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020MH\u0080\b¢\u0006\u0004\bN\u0010O\u001a\u001c\u0010P\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\bP\u0010\u0010\u001a\u0016\u0010Q\u001a\u0004\u0018\u00010\u000e*\u00020\u000bH\u0080\b¢\u0006\u0004\bQ\u0010R\u001a\u001c\u0010T\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010S\u001a\u00020\fH\u0080\b¢\u0006\u0004\bT\u0010\u0010\u001a\u0014\u0010U\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bU\u0010$\u001a,\u0010Y\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010V\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\u00022\u0006\u0010X\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bY\u0010Z\u001a\u001c\u0010\\\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010[\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\b\\\u0010]\u001a\u001c\u0010_\u001a\u00020\f*\u00020\u000b2\u0006\u00109\u001a\u00020^H\u0080\b¢\u0006\u0004\b_\u0010`\u001a$\u00100\u001a\u00020\u000b*\u00020\u000b2\u0006\u00109\u001a\u00020^2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b0\u0010a\u001a\u001c\u0010c\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010b\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bc\u0010]\u001a\u001c\u0010e\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010d\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\be\u0010]\u001a\u001c\u0010g\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010f\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bg\u0010]\u001a\u001c\u0010h\u001a\u00020\u000b*\u00020\u000b2\u0006\u00102\u001a\u00020\fH\u0080\b¢\u0006\u0004\bh\u00104\u001a$\u00100\u001a\u00020)*\u00020\u000b2\u0006\u00109\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b0\u0010L\u001a$\u0010@\u001a\u00020\f*\u00020\u000b2\u0006\u0010?\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\fH\u0080\b¢\u0006\u0004\b@\u0010i\u001a,\u0010l\u001a\u00020\f*\u00020\u000b2\u0006\u0010b\u001a\u00020\u001d2\u0006\u0010j\u001a\u00020\f2\u0006\u0010k\u001a\u00020\fH\u0080\b¢\u0006\u0004\bl\u0010m\u001a$\u0010l\u001a\u00020\f*\u00020\u000b2\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010j\u001a\u00020\fH\u0080\b¢\u0006\u0004\bl\u0010n\u001a$\u0010p\u001a\u00020\f*\u00020\u000b2\u0006\u0010o\u001a\u00020.2\u0006\u0010j\u001a\u00020\fH\u0080\b¢\u0006\u0004\bp\u0010n\u001a4\u0010q\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020.2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bq\u0010r\u001a\u001e\u0010u\u001a\u00020\b*\u00020\u000b2\b\u0010t\u001a\u0004\u0018\u00010sH\u0080\b¢\u0006\u0004\bu\u0010v\u001a\u0014\u0010w\u001a\u00020\u0002*\u00020\u000bH\u0080\b¢\u0006\u0004\bw\u0010$\u001a\u0014\u0010x\u001a\u00020\u000b*\u00020\u000bH\u0080\b¢\u0006\u0004\bx\u0010y\u001a\u0014\u0010z\u001a\u00020.*\u00020\u000bH\u0080\b¢\u0006\u0004\bz\u0010H\u001a\u001c\u0010z\u001a\u00020.*\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0080\b¢\u0006\u0004\bz\u0010{\u001a\u001b\u0010~\u001a\u00020|*\u00020\u000b2\u0006\u0010}\u001a\u00020|H\u0000¢\u0006\u0004\b~\u0010\u007f\u001a\u001d\u0010\u0080\u0001\u001a\u00020|*\u00020\u000b2\u0006\u0010}\u001a\u00020|H\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u007f\u001a\u0017\u0010\u0081\u0001\u001a\u00020\u0002*\u00020|H\u0080\b¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u001f\u0010\u0083\u0001\u001a\u00020\u0002*\u00020|2\u0006\u0010\u0017\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a \u0010\u0086\u0001\u001a\u00020\f*\u00020|2\u0007\u0010\u0085\u0001\u001a\u00020\fH\u0080\b¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a \u0010\u0089\u0001\u001a\u00020\f*\u00020|2\u0007\u0010\u0088\u0001\u001a\u00020\u0002H\u0080\b¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0017\u0010\u008b\u0001\u001a\u00020)*\u00020|H\u0080\b¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001\u001aG\u0010\u0090\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u008d\u0001*\u00020\u000b2\u0006\u0010j\u001a\u00020\f2\u001c\u0010\u008f\u0001\u001a\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u008e\u0001H\u0080\bø\u0001\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\"'\u0010\u0092\u0001\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u0012\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0017\u0010\u0098\u0001\u001a\u00020\u00028\u0000X\u0080T¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0017\u0010\u009a\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0017\u0010\u009c\u0001\u001a\u00020\f8\u0000X\u0080T¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009b\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009d\u0001"}, d2 = {"Lcom/applovin/shadow/okio/Segment;", "segment", "", "segmentPos", "", "bytes", "bytesOffset", "bytesLimit", "", "rangeEquals", "(Lcom/applovin/shadow/okio/Segment;I[BII)Z", "Lcom/applovin/shadow/okio/Buffer;", "", "newline", "", "readUtf8Line", "(Lcom/applovin/shadow/okio/Buffer;J)Ljava/lang/String;", "Lcom/applovin/shadow/okio/Options;", "options", "selectTruncated", "selectPrefix", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Options;Z)I", "out", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "byteCount", "commonCopyTo", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;", "commonCompleteSegmentByteCount", "(Lcom/applovin/shadow/okio/Buffer;)J", "", "commonReadByte", "(Lcom/applovin/shadow/okio/Buffer;)B", "", "commonReadShort", "(Lcom/applovin/shadow/okio/Buffer;)S", "commonReadInt", "(Lcom/applovin/shadow/okio/Buffer;)I", "commonReadLong", "pos", "commonGet", "(Lcom/applovin/shadow/okio/Buffer;J)B", "Lef/C;", "commonClear", "(Lcom/applovin/shadow/okio/Buffer;)V", "commonSkip", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/ByteString;", "byteString", "commonWrite", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/Buffer;", "v", "commonWriteDecimalLong", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/Buffer;", "commonWriteHexadecimalUnsignedLong", "minimumCapacity", "commonWritableSegment", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/Segment;", "source", "(Lcom/applovin/shadow/okio/Buffer;[B)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;[BII)Lcom/applovin/shadow/okio/Buffer;", "commonReadByteArray", "(Lcom/applovin/shadow/okio/Buffer;)[B", "(Lcom/applovin/shadow/okio/Buffer;J)[B", "sink", "commonRead", "(Lcom/applovin/shadow/okio/Buffer;[B)I", "commonReadFully", "(Lcom/applovin/shadow/okio/Buffer;[B)V", "(Lcom/applovin/shadow/okio/Buffer;[BII)I", "commonReadDecimalLong", "commonReadHexadecimalUnsignedLong", "commonReadByteString", "(Lcom/applovin/shadow/okio/Buffer;)Lcom/applovin/shadow/okio/ByteString;", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/ByteString;", "commonSelect", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Options;)I", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "commonReadAll", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Sink;)J", "commonReadUtf8", "commonReadUtf8Line", "(Lcom/applovin/shadow/okio/Buffer;)Ljava/lang/String;", "limit", "commonReadUtf8LineStrict", "commonReadUtf8CodePoint", "string", "beginIndex", "endIndex", "commonWriteUtf8", "(Lcom/applovin/shadow/okio/Buffer;Ljava/lang/String;II)Lcom/applovin/shadow/okio/Buffer;", "codePoint", "commonWriteUtf8CodePoint", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/Source;", "commonWriteAll", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/Buffer;", "b", "commonWriteByte", "s", "commonWriteShort", "i", "commonWriteInt", "commonWriteLong", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer;J)J", "fromIndex", "toIndex", "commonIndexOf", "(Lcom/applovin/shadow/okio/Buffer;BJJ)J", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "commonIndexOfElement", "commonRangeEquals", "(Lcom/applovin/shadow/okio/Buffer;JLcom/applovin/shadow/okio/ByteString;II)Z", "", "other", "commonEquals", "(Lcom/applovin/shadow/okio/Buffer;Ljava/lang/Object;)Z", "commonHashCode", "commonCopy", "(Lcom/applovin/shadow/okio/Buffer;)Lcom/applovin/shadow/okio/Buffer;", "commonSnapshot", "(Lcom/applovin/shadow/okio/Buffer;I)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "commonReadUnsafe", "(Lcom/applovin/shadow/okio/Buffer;Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "commonReadAndWriteUnsafe", "commonNext", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)I", "commonSeek", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;J)I", "newSize", "commonResizeBuffer", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;J)J", "minByteCount", "commonExpandBuffer", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;I)J", "commonClose", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)V", "T", "Lkotlin/Function2;", "lambda", "seek", "(Lcg/g;JLtf/p;)Ljava/lang/Object;", "HEX_DIGIT_BYTES", "[B", "getHEX_DIGIT_BYTES", "()[B", "getHEX_DIGIT_BYTES$annotations", "()V", "SEGMENTING_THRESHOLD", "I", "OVERFLOW_ZONE", "J", "OVERFLOW_DIGIT_START", "com.applovin.shadow.okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.applovin.shadow.okio.internal.-Buffer, reason: invalid class name */
/* loaded from: classes.dex */
public final class Buffer {

    @NotNull
    private static final byte[] HEX_DIGIT_BYTES = _JvmPlatformKt.asUtf8ToByteArray("0123456789abcdef");
    public static final long OVERFLOW_DIGIT_START = -7;
    public static final long OVERFLOW_ZONE = -922337203685477580L;
    public static final int SEGMENTING_THRESHOLD = 4096;

    public static final void commonClear(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        buffer.skip(buffer.size());
    }

    public static final void commonClose(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(unsafeCursor, "<this>");
        if (unsafeCursor.buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        unsafeCursor.buffer = null;
        unsafeCursor.setSegment$okio(null);
        unsafeCursor.offset = -1L;
        unsafeCursor.data = null;
        unsafeCursor.start = -1;
        unsafeCursor.end = -1;
    }

    public static final long commonCompleteSegmentByteCount(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        long size = buffer.size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        Segment segment2 = segment.prev;
        AbstractC3340k.b(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r2 - segment2.pos);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonCopy(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        if (buffer.size() == 0) {
            return buffer2;
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer2.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            AbstractC3340k.b(segment3);
            AbstractC3340k.b(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer2.setSize$okio(buffer.size());
        return buffer2;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonCopyTo(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer out, long j8, long j10) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(out, "out");
        long j11 = j8;
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j11, j10);
        if (j10 != 0) {
            out.setSize$okio(out.size() + j10);
            Segment segment = buffer.head;
            while (true) {
                AbstractC3340k.b(segment);
                int i5 = segment.limit;
                int i10 = segment.pos;
                if (j11 < i5 - i10) {
                    break;
                }
                j11 -= i5 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j12 = j10;
            while (j12 > 0) {
                AbstractC3340k.b(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i11 = segmentSharedCopy.pos + ((int) j11);
                segmentSharedCopy.pos = i11;
                segmentSharedCopy.limit = Math.min(i11 + ((int) j12), segmentSharedCopy.limit);
                Segment segment3 = out.head;
                if (segment3 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    out.head = segmentSharedCopy;
                } else {
                    AbstractC3340k.b(segment3);
                    Segment segment4 = segment3.prev;
                    AbstractC3340k.b(segment4);
                    segment4.push(segmentSharedCopy);
                }
                j12 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j11 = 0;
            }
        }
        return buffer;
    }

    public static final boolean commonEquals(@NotNull com.applovin.shadow.okio.Buffer buffer, @Nullable Object obj) {
        AbstractC3340k.e(buffer, "<this>");
        if (buffer == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.shadow.okio.Buffer)) {
            return false;
        }
        com.applovin.shadow.okio.Buffer buffer2 = (com.applovin.shadow.okio.Buffer) obj;
        if (buffer.size() != buffer2.size()) {
            return false;
        }
        if (buffer.size() == 0) {
            return true;
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        Segment segment2 = buffer2.head;
        AbstractC3340k.b(segment2);
        int i5 = segment.pos;
        int i10 = segment2.pos;
        long j8 = 0;
        while (j8 < buffer.size()) {
            long jMin = Math.min(segment.limit - i5, segment2.limit - i10);
            long j10 = 0;
            while (j10 < jMin) {
                int i11 = i5 + 1;
                int i12 = i10 + 1;
                if (segment.data[i5] != segment2.data[i10]) {
                    return false;
                }
                j10++;
                i5 = i11;
                i10 = i12;
            }
            if (i5 == segment.limit) {
                segment = segment.next;
                AbstractC3340k.b(segment);
                i5 = segment.pos;
            }
            if (i10 == segment2.limit) {
                segment2 = segment2.next;
                AbstractC3340k.b(segment2);
                i10 = segment2.pos;
            }
            j8 += jMin;
        }
        return true;
    }

    public static final long commonExpandBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, int i5) {
        AbstractC3340k.e(unsafeCursor, "<this>");
        if (i5 <= 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "minByteCount <= 0: ").toString());
        }
        if (i5 > 8192) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "minByteCount > Segment.SIZE: ").toString());
        }
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i5);
        int i10 = 8192 - segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = Segment.SIZE;
        long j8 = i10;
        buffer.setSize$okio(size + j8);
        unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
        unsafeCursor.offset = size;
        unsafeCursor.data = segmentWritableSegment$okio.data;
        unsafeCursor.start = 8192 - i10;
        unsafeCursor.end = Segment.SIZE;
        return j8;
    }

    public static final byte commonGet(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) {
        AbstractC3340k.e(buffer, "<this>");
        SegmentedByteString.checkOffsetAndCount(buffer.size(), j8, 1L);
        Segment segment = buffer.head;
        if (segment == null) {
            AbstractC3340k.b(null);
            throw null;
        }
        if (buffer.size() - j8 < j8) {
            long size = buffer.size();
            while (size > j8) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + j8) - size)];
        }
        long j10 = 0;
        while (true) {
            int i5 = segment.limit;
            int i10 = segment.pos;
            long j11 = (i5 - i10) + j10;
            if (j11 > j8) {
                return segment.data[(int) ((i10 + j8) - j10)];
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            j10 = j11;
        }
    }

    public static final int commonHashCode(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        Segment segment = buffer.head;
        if (segment == null) {
            return 0;
        }
        int i5 = 1;
        do {
            int i10 = segment.limit;
            for (int i11 = segment.pos; i11 < i10; i11++) {
                i5 = (i5 * 31) + segment.data[i11];
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
        } while (segment != buffer.head);
        return i5;
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.Buffer buffer, byte b5, long j8, long j10) {
        Segment segment;
        int i5;
        AbstractC3340k.e(buffer, "<this>");
        long size = 0;
        if (0 > j8 || j8 > j10) {
            throw new IllegalArgumentException(("size=" + buffer.size() + " fromIndex=" + j8 + " toIndex=" + j10).toString());
        }
        if (j10 > buffer.size()) {
            j10 = buffer.size();
        }
        if (j8 == j10 || (segment = buffer.head) == null) {
            return -1L;
        }
        if (buffer.size() - j8 < j8) {
            size = buffer.size();
            while (size > j8) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < j10) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + j10) - size);
                i5 = (int) ((segment.pos + j8) - size);
                while (i5 < iMin) {
                    if (bArr[i5] != b5) {
                        i5++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC3340k.b(segment);
                j8 = size;
            }
            return -1L;
        }
        while (true) {
            long j11 = (segment.limit - segment.pos) + size;
            if (j11 > j8) {
                break;
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            size = j11;
        }
        while (size < j10) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + j10) - size);
            i5 = (int) ((segment.pos + j8) - size);
            while (i5 < iMin2) {
                if (bArr2[i5] != b5) {
                    i5++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            AbstractC3340k.b(segment);
            j8 = size;
        }
        return -1L;
        return (i5 - segment.pos) + size;
    }

    public static final long commonIndexOfElement(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull ByteString targetBytes, long j8) {
        int i5;
        int i10;
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(targetBytes, "targetBytes");
        long size = 0;
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "fromIndex < 0: ").toString());
        }
        Segment segment = buffer.head;
        if (segment == null) {
            return -1L;
        }
        if (buffer.size() - j8 < j8) {
            size = buffer.size();
            while (size > j8) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b5 = targetBytes.getByte(0);
                byte b10 = targetBytes.getByte(1);
                while (size < buffer.size()) {
                    byte[] bArr = segment.data;
                    i5 = (int) ((segment.pos + j8) - size);
                    int i11 = segment.limit;
                    while (i5 < i11) {
                        byte b11 = bArr[i5];
                        if (b11 == b5 || b11 == b10) {
                            i10 = segment.pos;
                        } else {
                            i5++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC3340k.b(segment);
                    j8 = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < buffer.size()) {
                    byte[] bArr2 = segment.data;
                    i5 = (int) ((segment.pos + j8) - size);
                    int i12 = segment.limit;
                    while (i5 < i12) {
                        byte b12 = bArr2[i5];
                        for (byte b13 : bArrInternalArray$okio) {
                            if (b12 == b13) {
                                i10 = segment.pos;
                            }
                        }
                        i5++;
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC3340k.b(segment);
                    j8 = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j10 = (segment.limit - segment.pos) + size;
            if (j10 > j8) {
                break;
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            size = j10;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < buffer.size()) {
                byte[] bArr3 = segment.data;
                i5 = (int) ((segment.pos + j8) - size);
                int i13 = segment.limit;
                while (i5 < i13) {
                    byte b16 = bArr3[i5];
                    if (b16 == b14 || b16 == b15) {
                        i10 = segment.pos;
                    } else {
                        i5++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC3340k.b(segment);
                j8 = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < buffer.size()) {
                byte[] bArr4 = segment.data;
                i5 = (int) ((segment.pos + j8) - size);
                int i14 = segment.limit;
                while (i5 < i14) {
                    byte b17 = bArr4[i5];
                    for (byte b18 : bArrInternalArray$okio2) {
                        if (b17 == b18) {
                            i10 = segment.pos;
                        }
                    }
                    i5++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC3340k.b(segment);
                j8 = size;
            }
        }
        return -1L;
        return (i5 - i10) + size;
    }

    public static final int commonNext(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(unsafeCursor, "<this>");
        long j8 = unsafeCursor.offset;
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        AbstractC3340k.b(buffer);
        if (j8 == buffer.size()) {
            throw new IllegalStateException("no more bytes");
        }
        long j10 = unsafeCursor.offset;
        return unsafeCursor.seek(j10 == -1 ? 0L : j10 + (unsafeCursor.end - unsafeCursor.start));
    }

    public static final boolean commonRangeEquals(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8, @NotNull ByteString bytes, int i5, int i10) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(bytes, "bytes");
        if (j8 < 0 || i5 < 0 || i10 < 0 || buffer.size() - j8 < i10 || bytes.size() - i5 < i10) {
            return false;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (buffer.getByte(i11 + j8) != bytes.getByte(i5 + i11)) {
                return false;
            }
        }
        return true;
    }

    public static final int commonRead(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] sink) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(sink, "sink");
        return buffer.read(sink, 0, sink.length);
    }

    public static final long commonReadAll(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Sink sink) throws IOException {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(sink, "sink");
        long size = buffer.size();
        if (size > 0) {
            sink.write(buffer, size);
        }
        return size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadAndWriteUnsafe(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = true;
        return unsafeCursorResolveDefaultParameter;
    }

    public static final byte commonReadByte(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        int i11 = i5 + 1;
        byte b5 = segment.data[i5];
        buffer.setSize$okio(buffer.size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b5;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return b5;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        return buffer.readByteArray(buffer.size());
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        return buffer.readByteString(buffer.size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
    
        r0 = new com.applovin.shadow.okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        r0.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r0.readUtf8());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadDecimalLong(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r19) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.commonReadDecimalLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] sink) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(sink, "sink");
        int i5 = 0;
        while (i5 < sink.length) {
            int i10 = buffer.read(sink, i5, sink.length - i5);
            if (i10 == -1) {
                throw new EOFException();
            }
            i5 += i10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a6 A[EDGE_INSN: B:43:0x00a6->B:37:0x00a6 BREAK  A[LOOP:0: B:5:0x0012->B:45:?], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long commonReadHexadecimalUnsignedLong(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r14) throws java.io.EOFException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.AbstractC3340k.e(r14, r0)
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lb0
            r0 = 0
            r1 = r0
            r4 = r2
        L12:
            com.applovin.shadow.okio.Segment r6 = r14.head
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L1d:
            if (r8 >= r9) goto L92
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2c
            r11 = 57
            if (r10 > r11) goto L2c
            int r11 = r10 + (-48)
            goto L41
        L2c:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-87)
            goto L41
        L37:
            r11 = 65
            if (r10 < r11) goto L76
            r11 = 70
            if (r10 > r11) goto L76
            int r11 = r10 + (-55)
        L41:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L51
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1d
        L51:
            com.applovin.shadow.okio.Buffer r14 = new com.applovin.shadow.okio.Buffer
            r14.<init>()
            com.applovin.shadow.okio.Buffer r14 = r14.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r14 = r14.writeByte(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Number too large: "
            r1.<init>(r2)
            java.lang.String r14 = r14.readUtf8()
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            r0.<init>(r14)
            throw r0
        L76:
            if (r0 == 0) goto L7a
            r1 = 1
            goto L92
        L7a:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            r0.<init>(r1)
            java.lang.String r1 = com.applovin.shadow.okio.SegmentedByteString.toHexString(r10)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L92:
            if (r8 != r9) goto L9e
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto La0
        L9e:
            r6.pos = r8
        La0:
            if (r1 != 0) goto La6
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto L12
        La6:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lb0:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.commonReadHexadecimalUnsignedLong(com.applovin.shadow.okio.Buffer):long");
    }

    public static final int commonReadInt(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (buffer.size() < 4) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 4) {
            return (buffer.readByte() & ForkServer.ERROR) | ((buffer.readByte() & ForkServer.ERROR) << 24) | ((buffer.readByte() & ForkServer.ERROR) << 16) | ((buffer.readByte() & ForkServer.ERROR) << 8);
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 3;
        int i12 = ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
        int i13 = i5 + 4;
        int i14 = (bArr[i11] & ForkServer.ERROR) | i12;
        buffer.setSize$okio(buffer.size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    public static final long commonReadLong(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (buffer.size() < 8) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 8) {
            return ((buffer.readInt() & 4294967295L) << 32) | (4294967295L & buffer.readInt());
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 7;
        long j8 = ((bArr[i5 + 3] & 255) << 32) | ((bArr[i5] & 255) << 56) | ((bArr[i5 + 1] & 255) << 48) | ((bArr[i5 + 2] & 255) << 40) | ((bArr[i5 + 4] & 255) << 24) | ((bArr[i5 + 5] & 255) << 16) | ((bArr[i5 + 6] & 255) << 8);
        int i12 = i5 + 8;
        long j10 = j8 | (bArr[i11] & 255);
        buffer.setSize$okio(buffer.size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j10;
        }
        buffer.head = segment.pop();
        SegmentPool.recycle(segment);
        return j10;
    }

    public static final short commonReadShort(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (buffer.size() < 2) {
            throw new EOFException();
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 2) {
            return (short) ((buffer.readByte() & ForkServer.ERROR) | ((buffer.readByte() & ForkServer.ERROR) << 8));
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 1;
        int i12 = (bArr[i5] & ForkServer.ERROR) << 8;
        int i13 = i5 + 2;
        int i14 = (bArr[i11] & ForkServer.ERROR) | i12;
        buffer.setSize$okio(buffer.size() - 2);
        if (i13 == i10) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @NotNull
    public static final Buffer.UnsafeCursor commonReadUnsafe(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Buffer.UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(unsafeCursor, "unsafeCursor");
        Buffer.UnsafeCursor unsafeCursorResolveDefaultParameter = SegmentedByteString.resolveDefaultParameter(unsafeCursor);
        if (unsafeCursorResolveDefaultParameter.buffer != null) {
            throw new IllegalStateException("already attached to a buffer");
        }
        unsafeCursorResolveDefaultParameter.buffer = buffer;
        unsafeCursorResolveDefaultParameter.readWrite = false;
        return unsafeCursorResolveDefaultParameter;
    }

    @NotNull
    public static final String commonReadUtf8(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (buffer.size() < j8) {
            throw new EOFException();
        }
        if (j8 == 0) {
            return "";
        }
        Segment segment = buffer.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        if (i5 + j8 > segment.limit) {
            return _Utf8Kt.commonToUtf8String$default(buffer.readByteArray(j8), 0, 0, 3, null);
        }
        int i10 = (int) j8;
        String strCommonToUtf8String = _Utf8Kt.commonToUtf8String(segment.data, i5, i5 + i10);
        segment.pos += i10;
        buffer.setSize$okio(buffer.size() - j8);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return strCommonToUtf8String;
    }

    public static final int commonReadUtf8CodePoint(@NotNull com.applovin.shadow.okio.Buffer buffer) throws EOFException {
        int i5;
        int i10;
        int i11;
        AbstractC3340k.e(buffer, "<this>");
        if (buffer.size() == 0) {
            throw new EOFException();
        }
        byte b5 = buffer.getByte(0L);
        if ((b5 & 128) == 0) {
            i5 = b5 & 127;
            i11 = 0;
            i10 = 1;
        } else if ((b5 & 224) == 192) {
            i5 = b5 & 31;
            i10 = 2;
            i11 = 128;
        } else if ((b5 & 240) == 224) {
            i5 = b5 & 15;
            i10 = 3;
            i11 = 2048;
        } else {
            if ((b5 & 248) != 240) {
                buffer.skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i5 = b5 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j8 = i10;
        if (buffer.size() < j8) {
            StringBuilder sbL = f.l(i10, "size < ", ": ");
            sbL.append(buffer.size());
            sbL.append(" (to read code point prefixed 0x");
            sbL.append(SegmentedByteString.toHexString(b5));
            sbL.append(')');
            throw new EOFException(sbL.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte b10 = buffer.getByte(j10);
            if ((b10 & 192) != 128) {
                buffer.skip(j10);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i5 = (i5 << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        buffer.skip(j8);
        return i5 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i5 || i5 >= 57344) && i5 >= i11) ? i5 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Nullable
    public static final String commonReadUtf8Line(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        long jIndexOf = buffer.indexOf((byte) 10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (buffer.size() != 0) {
            return buffer.readUtf8(buffer.size());
        }
        return null;
    }

    @NotNull
    public static final String commonReadUtf8LineStrict(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "limit < 0: ").toString());
        }
        long j10 = j8 != Long.MAX_VALUE ? j8 + 1 : Long.MAX_VALUE;
        long jIndexOf = buffer.indexOf((byte) 10, 0L, j10);
        if (jIndexOf != -1) {
            return readUtf8Line(buffer, jIndexOf);
        }
        if (j10 < buffer.size() && buffer.getByte(j10 - 1) == 13 && buffer.getByte(j10) == 10) {
            return readUtf8Line(buffer, j10);
        }
        com.applovin.shadow.okio.Buffer buffer2 = new com.applovin.shadow.okio.Buffer();
        buffer.copyTo(buffer2, 0L, Math.min(32, buffer.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(buffer.size(), j8) + " content=" + buffer2.readByteString().hex() + (char) 8230);
    }

    public static final long commonResizeBuffer(@NotNull Buffer.UnsafeCursor unsafeCursor, long j8) {
        AbstractC3340k.e(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (!unsafeCursor.readWrite) {
            throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
        }
        long size = buffer.size();
        if (j8 <= size) {
            if (j8 < 0) {
                throw new IllegalArgumentException(AbstractC0279p0.k(j8, "newSize < 0: ").toString());
            }
            long j10 = size - j8;
            while (true) {
                if (j10 <= 0) {
                    break;
                }
                Segment segment = buffer.head;
                AbstractC3340k.b(segment);
                Segment segment2 = segment.prev;
                AbstractC3340k.b(segment2);
                int i5 = segment2.limit;
                long j11 = i5 - segment2.pos;
                if (j11 > j10) {
                    segment2.limit = i5 - ((int) j10);
                    break;
                }
                buffer.head = segment2.pop();
                SegmentPool.recycle(segment2);
                j10 -= j11;
            }
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j8;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
        } else if (j8 > size) {
            long j12 = j8 - size;
            boolean z2 = true;
            while (j12 > 0) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                int iMin = (int) Math.min(j12, 8192 - segmentWritableSegment$okio.limit);
                segmentWritableSegment$okio.limit += iMin;
                j12 -= iMin;
                if (z2) {
                    unsafeCursor.setSegment$okio(segmentWritableSegment$okio);
                    unsafeCursor.offset = size;
                    unsafeCursor.data = segmentWritableSegment$okio.data;
                    int i10 = segmentWritableSegment$okio.limit;
                    unsafeCursor.start = i10 - iMin;
                    unsafeCursor.end = i10;
                    z2 = false;
                }
            }
        }
        buffer.setSize$okio(j8);
        return size;
    }

    public static final int commonSeek(@NotNull Buffer.UnsafeCursor unsafeCursor, long j8) {
        Segment segmentPush;
        AbstractC3340k.e(unsafeCursor, "<this>");
        com.applovin.shadow.okio.Buffer buffer = unsafeCursor.buffer;
        if (buffer == null) {
            throw new IllegalStateException("not attached to a buffer");
        }
        if (j8 < -1 || j8 > buffer.size()) {
            StringBuilder sbU = M6.u(j8, "offset=", " > size=");
            sbU.append(buffer.size());
            throw new ArrayIndexOutOfBoundsException(sbU.toString());
        }
        if (j8 == -1 || j8 == buffer.size()) {
            unsafeCursor.setSegment$okio(null);
            unsafeCursor.offset = j8;
            unsafeCursor.data = null;
            unsafeCursor.start = -1;
            unsafeCursor.end = -1;
            return -1;
        }
        long size = buffer.size();
        Segment segment = buffer.head;
        long j10 = 0;
        if (unsafeCursor.getSegment() != null) {
            long j11 = unsafeCursor.offset;
            int i5 = unsafeCursor.start;
            AbstractC3340k.b(unsafeCursor.getSegment());
            long j12 = j11 - (i5 - r9.pos);
            if (j12 > j8) {
                segmentPush = segment;
                segment = unsafeCursor.getSegment();
                size = j12;
            } else {
                segmentPush = unsafeCursor.getSegment();
                j10 = j12;
            }
        } else {
            segmentPush = segment;
        }
        if (size - j8 > j8 - j10) {
            while (true) {
                AbstractC3340k.b(segmentPush);
                int i10 = segmentPush.limit;
                int i11 = segmentPush.pos;
                if (j8 < (i10 - i11) + j10) {
                    break;
                }
                j10 += i10 - i11;
                segmentPush = segmentPush.next;
            }
        } else {
            while (size > j8) {
                AbstractC3340k.b(segment);
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            j10 = size;
            segmentPush = segment;
        }
        if (unsafeCursor.readWrite) {
            AbstractC3340k.b(segmentPush);
            if (segmentPush.shared) {
                Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                if (buffer.head == segmentPush) {
                    buffer.head = segmentUnsharedCopy;
                }
                segmentPush = segmentPush.push(segmentUnsharedCopy);
                Segment segment2 = segmentPush.prev;
                AbstractC3340k.b(segment2);
                segment2.pop();
            }
        }
        unsafeCursor.setSegment$okio(segmentPush);
        unsafeCursor.offset = j8;
        AbstractC3340k.b(segmentPush);
        unsafeCursor.data = segmentPush.data;
        int i12 = segmentPush.pos + ((int) (j8 - j10));
        unsafeCursor.start = i12;
        int i13 = segmentPush.limit;
        unsafeCursor.end = i13;
        return i13 - i12;
    }

    public static final int commonSelect(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Options options) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(options, "options");
        int iSelectPrefix$default = selectPrefix$default(buffer, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        buffer.skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public static final void commonSkip(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        while (j8 > 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j8, segment.limit - segment.pos);
            long j10 = iMin;
            buffer.setSize$okio(buffer.size() - j10);
            j8 -= j10;
            int i5 = segment.pos + iMin;
            segment.pos = i5;
            if (i5 == segment.limit) {
                buffer.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull com.applovin.shadow.okio.Buffer buffer) {
        AbstractC3340k.e(buffer, "<this>");
        if (buffer.size() <= 2147483647L) {
            return buffer.snapshot((int) buffer.size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + buffer.size()).toString());
    }

    @NotNull
    public static final Segment commonWritableSegment(@NotNull com.applovin.shadow.okio.Buffer buffer, int i5) {
        AbstractC3340k.e(buffer, "<this>");
        if (i5 < 1 || i5 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = buffer.head;
        if (segment != null) {
            AbstractC3340k.b(segment);
            Segment segment2 = segment.prev;
            AbstractC3340k.b(segment2);
            return (segment2.limit + i5 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        buffer.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull ByteString byteString, int i5, int i10) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(byteString, "byteString");
        byteString.write$okio(buffer, i5, i10);
        return buffer;
    }

    public static /* synthetic */ com.applovin.shadow.okio.Buffer commonWrite$default(com.applovin.shadow.okio.Buffer buffer, ByteString byteString, int i5, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i5 = 0;
        }
        if ((i11 & 4) != 0) {
            i10 = byteString.size();
        }
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(byteString, "byteString");
        byteString.write$okio(buffer, i5, i10);
        return buffer;
    }

    public static final long commonWriteAll(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Source source) throws IOException {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(source, "source");
        long j8 = 0;
        while (true) {
            long j10 = source.read(buffer, 8192L);
            if (j10 == -1) {
                return j8;
            }
            j8 += j10;
        }
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteByte(@NotNull com.applovin.shadow.okio.Buffer buffer, int i5) {
        AbstractC3340k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i10 + 1;
        bArr[i10] = (byte) i5;
        buffer.setSize$okio(buffer.size() + 1);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteDecimalLong(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) {
        boolean z2;
        AbstractC3340k.e(buffer, "<this>");
        if (j8 == 0) {
            return buffer.writeByte(48);
        }
        int i5 = 1;
        if (j8 < 0) {
            j8 = -j8;
            if (j8 < 0) {
                return buffer.writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (j8 >= 100000000) {
            i5 = j8 < 1000000000000L ? j8 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? j8 < 1000000000 ? 9 : 10 : j8 < 100000000000L ? 11 : 12 : j8 < 1000000000000000L ? j8 < 10000000000000L ? 13 : j8 < 100000000000000L ? 14 : 15 : j8 < 100000000000000000L ? j8 < 10000000000000000L ? 16 : 17 : j8 < 1000000000000000000L ? 18 : 19;
        } else if (j8 >= 10000) {
            i5 = j8 < 1000000 ? j8 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH ? 5 : 6 : j8 < 10000000 ? 7 : 8;
        } else if (j8 >= 100) {
            i5 = j8 < 1000 ? 3 : 4;
        } else if (j8 >= 10) {
            i5 = 2;
        }
        if (z2) {
            i5++;
        }
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i5);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i5;
        while (j8 != 0) {
            long j10 = 10;
            i10--;
            bArr[i10] = getHEX_DIGIT_BYTES()[(int) (j8 % j10)];
            j8 /= j10;
        }
        if (z2) {
            bArr[i10 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i5;
        buffer.setSize$okio(buffer.size() + i5);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteHexadecimalUnsignedLong(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) {
        AbstractC3340k.e(buffer, "<this>");
        if (j8 == 0) {
            return buffer.writeByte(48);
        }
        long j10 = (j8 >>> 1) | j8;
        long j11 = j10 | (j10 >>> 2);
        long j12 = j11 | (j11 >>> 4);
        long j13 = j12 | (j12 >>> 8);
        long j14 = j13 | (j13 >>> 16);
        long j15 = j14 | (j14 >>> 32);
        long j16 = j15 - ((j15 >>> 1) & 6148914691236517205L);
        long j17 = ((j16 >>> 2) & 3689348814741910323L) + (j16 & 3689348814741910323L);
        long j18 = ((j17 >>> 4) + j17) & 1085102592571150095L;
        long j19 = j18 + (j18 >>> 8);
        long j20 = j19 + (j19 >>> 16);
        int i5 = (int) ((((j20 & 63) + ((j20 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i5);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i5) - 1; i11 >= i10; i11--) {
            bArr[i11] = getHEX_DIGIT_BYTES()[(int) (15 & j8)];
            j8 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i5;
        buffer.setSize$okio(buffer.size() + i5);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteInt(@NotNull com.applovin.shadow.okio.Buffer buffer, int i5) {
        AbstractC3340k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i5 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i5 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i5 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i5 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteLong(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) {
        AbstractC3340k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        bArr[i5] = (byte) ((j8 >>> 56) & 255);
        bArr[i5 + 1] = (byte) ((j8 >>> 48) & 255);
        bArr[i5 + 2] = (byte) ((j8 >>> 40) & 255);
        bArr[i5 + 3] = (byte) ((j8 >>> 32) & 255);
        bArr[i5 + 4] = (byte) ((j8 >>> 24) & 255);
        bArr[i5 + 5] = (byte) ((j8 >>> 16) & 255);
        bArr[i5 + 6] = (byte) ((j8 >>> 8) & 255);
        bArr[i5 + 7] = (byte) (j8 & 255);
        segmentWritableSegment$okio.limit = i5 + 8;
        buffer.setSize$okio(buffer.size() + 8);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteShort(@NotNull com.applovin.shadow.okio.Buffer buffer, int i5) {
        AbstractC3340k.e(buffer, "<this>");
        Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i5 >>> 8) & 255);
        bArr[i10 + 1] = (byte) (i5 & 255);
        segmentWritableSegment$okio.limit = i10 + 2;
        buffer.setSize$okio(buffer.size() + 2);
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull String string, int i5, int i10) {
        char cCharAt;
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(string, "string");
        if (i5 < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(i5, "beginIndex < 0: ").toString());
        }
        if (i10 < i5) {
            throw new IllegalArgumentException(v.e(i10, i5, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i10 > string.length()) {
            StringBuilder sbL = f.l(i10, "endIndex > string.length: ", " > ");
            sbL.append(string.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        while (i5 < i10) {
            char cCharAt2 = string.charAt(i5);
            if (cCharAt2 < 128) {
                Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                byte[] bArr = segmentWritableSegment$okio.data;
                int i11 = segmentWritableSegment$okio.limit - i5;
                int iMin = Math.min(i10, 8192 - i11);
                int i12 = i5 + 1;
                bArr[i5 + i11] = (byte) cCharAt2;
                while (true) {
                    i5 = i12;
                    if (i5 >= iMin || (cCharAt = string.charAt(i5)) >= 128) {
                        break;
                    }
                    i12 = i5 + 1;
                    bArr[i5 + i11] = (byte) cCharAt;
                }
                int i13 = segmentWritableSegment$okio.limit;
                int i14 = (i11 + i5) - i13;
                segmentWritableSegment$okio.limit = i13 + i14;
                buffer.setSize$okio(buffer.size() + i14);
            } else {
                if (cCharAt2 < 2048) {
                    Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(2);
                    byte[] bArr2 = segmentWritableSegment$okio2.data;
                    int i15 = segmentWritableSegment$okio2.limit;
                    bArr2[i15] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i15 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio2.limit = i15 + 2;
                    buffer.setSize$okio(buffer.size() + 2);
                } else if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                    Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(3);
                    byte[] bArr3 = segmentWritableSegment$okio3.data;
                    int i16 = segmentWritableSegment$okio3.limit;
                    bArr3[i16] = (byte) ((cCharAt2 >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
                    bArr3[i16 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i16 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    segmentWritableSegment$okio3.limit = i16 + 3;
                    buffer.setSize$okio(buffer.size() + 3);
                } else {
                    int i17 = i5 + 1;
                    char cCharAt3 = i17 < i10 ? string.charAt(i17) : (char) 0;
                    if (cCharAt2 > 56319 || 56320 > cCharAt3 || cCharAt3 >= 57344) {
                        buffer.writeByte(63);
                        i5 = i17;
                    } else {
                        int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                        Segment segmentWritableSegment$okio4 = buffer.writableSegment$okio(4);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i19 = segmentWritableSegment$okio4.limit;
                        bArr4[i19] = (byte) ((i18 >> 18) | 240);
                        bArr4[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                        bArr4[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                        bArr4[i19 + 3] = (byte) ((i18 & 63) | 128);
                        segmentWritableSegment$okio4.limit = i19 + 4;
                        buffer.setSize$okio(buffer.size() + 4);
                        i5 += 2;
                    }
                }
                i5++;
            }
        }
        return buffer;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWriteUtf8CodePoint(@NotNull com.applovin.shadow.okio.Buffer buffer, int i5) {
        AbstractC3340k.e(buffer, "<this>");
        if (i5 < 128) {
            buffer.writeByte(i5);
            return buffer;
        }
        if (i5 < 2048) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i10 = segmentWritableSegment$okio.limit;
            bArr[i10] = (byte) ((i5 >> 6) | 192);
            bArr[i10 + 1] = (byte) ((i5 & 63) | 128);
            segmentWritableSegment$okio.limit = i10 + 2;
            buffer.setSize$okio(buffer.size() + 2);
            return buffer;
        }
        if (55296 <= i5 && i5 < 57344) {
            buffer.writeByte(63);
            return buffer;
        }
        if (i5 < 65536) {
            Segment segmentWritableSegment$okio2 = buffer.writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i11 = segmentWritableSegment$okio2.limit;
            bArr2[i11] = (byte) ((i5 >> 12) | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
            bArr2[i11 + 1] = (byte) (((i5 >> 6) & 63) | 128);
            bArr2[i11 + 2] = (byte) ((i5 & 63) | 128);
            segmentWritableSegment$okio2.limit = i11 + 3;
            buffer.setSize$okio(buffer.size() + 3);
            return buffer;
        }
        if (i5 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i5));
        }
        Segment segmentWritableSegment$okio3 = buffer.writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i12 = segmentWritableSegment$okio3.limit;
        bArr3[i12] = (byte) ((i5 >> 18) | 240);
        bArr3[i12 + 1] = (byte) (((i5 >> 12) & 63) | 128);
        bArr3[i12 + 2] = (byte) (((i5 >> 6) & 63) | 128);
        bArr3[i12 + 3] = (byte) ((i5 & 63) | 128);
        segmentWritableSegment$okio3.limit = i12 + 4;
        buffer.setSize$okio(buffer.size() + 4);
        return buffer;
    }

    @NotNull
    public static final byte[] getHEX_DIGIT_BYTES() {
        return HEX_DIGIT_BYTES;
    }

    public static /* synthetic */ void getHEX_DIGIT_BYTES$annotations() {
    }

    public static final boolean rangeEquals(@NotNull Segment segment, int i5, @NotNull byte[] bytes, int i10, int i11) {
        AbstractC3340k.e(segment, "segment");
        AbstractC3340k.e(bytes, "bytes");
        int i12 = segment.limit;
        byte[] bArr = segment.data;
        while (i10 < i11) {
            if (i5 == i12) {
                segment = segment.next;
                AbstractC3340k.b(segment);
                byte[] bArr2 = segment.data;
                bArr = bArr2;
                i5 = segment.pos;
                i12 = segment.limit;
            }
            if (bArr[i5] != bytes[i10]) {
                return false;
            }
            i5++;
            i10++;
        }
        return true;
    }

    @NotNull
    public static final String readUtf8Line(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (j8 > 0) {
            long j10 = j8 - 1;
            if (buffer.getByte(j10) == 13) {
                String utf8 = buffer.readUtf8(j10);
                buffer.skip(2L);
                return utf8;
            }
        }
        String utf82 = buffer.readUtf8(j8);
        buffer.skip(1L);
        return utf82;
    }

    public static final <T> T seek(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8, @NotNull p lambda) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(lambda, "lambda");
        Segment segment = buffer.head;
        if (segment == null) {
            return (T) lambda.invoke(null, -1L);
        }
        if (buffer.size() - j8 < j8) {
            long size = buffer.size();
            while (size > j8) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            return (T) lambda.invoke(segment, Long.valueOf(size));
        }
        long j10 = 0;
        while (true) {
            long j11 = (segment.limit - segment.pos) + j10;
            if (j11 > j8) {
                return (T) lambda.invoke(segment, Long.valueOf(j10));
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            j10 = j11;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r19 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0087, code lost:
    
        return r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[LOOP:0: B:8:0x0026->B:46:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int selectPrefix(@org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Buffer r17, @org.jetbrains.annotations.NotNull com.applovin.shadow.okio.Options r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.internal.Buffer.selectPrefix(com.applovin.shadow.okio.Buffer, com.applovin.shadow.okio.Options, boolean):int");
    }

    public static /* synthetic */ int selectPrefix$default(com.applovin.shadow.okio.Buffer buffer, Options options, boolean z2, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            z2 = false;
        }
        return selectPrefix(buffer, options, z2);
    }

    public static final int commonRead(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] sink, int i5, int i10) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, i5, i10);
        Segment segment = buffer.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i10, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i11 = segment.pos;
        m.f0(i5, i11, i11 + iMin, bArr, sink);
        segment.pos += iMin;
        buffer.setSize$okio(buffer.size() - iMin);
        if (segment.pos == segment.limit) {
            buffer.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public static final byte[] commonReadByteArray(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (buffer.size() < j8) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j8];
        buffer.readFully(bArr);
        return bArr;
    }

    @NotNull
    public static final ByteString commonReadByteString(@NotNull com.applovin.shadow.okio.Buffer buffer, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        if (j8 < 0 || j8 > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount: ").toString());
        }
        if (buffer.size() < j8) {
            throw new EOFException();
        }
        if (j8 < 4096) {
            return new ByteString(buffer.readByteArray(j8));
        }
        ByteString byteStringSnapshot = buffer.snapshot((int) j8);
        buffer.skip(j8);
        return byteStringSnapshot;
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] source) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(source, "source");
        return buffer.write(source, 0, source.length);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull byte[] source, int i5, int i10) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(source, "source");
        long j8 = i10;
        SegmentedByteString.checkOffsetAndCount(source.length, i5, j8);
        int i11 = i10 + i5;
        while (i5 < i11) {
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
            int iMin = Math.min(i11 - i5, 8192 - segmentWritableSegment$okio.limit);
            int i12 = i5 + iMin;
            m.f0(segmentWritableSegment$okio.limit, i5, i12, source, segmentWritableSegment$okio.data);
            segmentWritableSegment$okio.limit += iMin;
            i5 = i12;
        }
        buffer.setSize$okio(buffer.size() + j8);
        return buffer;
    }

    public static final void commonReadFully(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer sink, long j8) throws EOFException {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(sink, "sink");
        if (buffer.size() >= j8) {
            sink.write(buffer, j8);
        } else {
            sink.write(buffer, buffer.size());
            throw new EOFException();
        }
    }

    @NotNull
    public static final ByteString commonSnapshot(@NotNull com.applovin.shadow.okio.Buffer buffer, int i5) {
        AbstractC3340k.e(buffer, "<this>");
        if (i5 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, i5);
        Segment segment = buffer.head;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i5) {
            AbstractC3340k.b(segment);
            int i13 = segment.limit;
            int i14 = segment.pos;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i12][];
        int[] iArr = new int[i12 * 2];
        Segment segment2 = buffer.head;
        int i15 = 0;
        while (i10 < i5) {
            AbstractC3340k.b(segment2);
            bArr[i15] = segment2.data;
            i10 += segment2.limit - segment2.pos;
            iArr[i15] = Math.min(i10, i5);
            iArr[i15 + i12] = segment2.pos;
            segment2.shared = true;
            i15++;
            segment2 = segment2.next;
        }
        return new C1681SegmentedByteString(bArr, iArr);
    }

    @NotNull
    public static final com.applovin.shadow.okio.Buffer commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull Source source, long j8) throws IOException {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(source, "source");
        while (j8 > 0) {
            long j10 = source.read(buffer, j8);
            if (j10 == -1) {
                throw new EOFException();
            }
            j8 -= j10;
        }
        return buffer;
    }

    public static final long commonRead(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer sink, long j8) {
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(sink, "sink");
        if (j8 < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(j8, "byteCount < 0: ").toString());
        }
        if (buffer.size() == 0) {
            return -1L;
        }
        if (j8 > buffer.size()) {
            j8 = buffer.size();
        }
        sink.write(buffer, j8);
        return j8;
    }

    public static final void commonWrite(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull com.applovin.shadow.okio.Buffer source, long j8) {
        Segment segment;
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(source, "source");
        if (source != buffer) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, j8);
            while (j8 > 0) {
                Segment segment2 = source.head;
                AbstractC3340k.b(segment2);
                int i5 = segment2.limit;
                AbstractC3340k.b(source.head);
                if (j8 < i5 - r1.pos) {
                    Segment segment3 = buffer.head;
                    if (segment3 != null) {
                        AbstractC3340k.b(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + j8) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            AbstractC3340k.b(segment4);
                            segment4.writeTo(segment, (int) j8);
                            source.setSize$okio(source.size() - j8);
                            buffer.setSize$okio(buffer.size() + j8);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    AbstractC3340k.b(segment5);
                    source.head = segment5.split((int) j8);
                }
                Segment segment6 = source.head;
                AbstractC3340k.b(segment6);
                long j10 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = buffer.head;
                if (segment7 == null) {
                    buffer.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    AbstractC3340k.b(segment7);
                    Segment segment8 = segment7.prev;
                    AbstractC3340k.b(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j10);
                buffer.setSize$okio(buffer.size() + j10);
                j8 -= j10;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    public static final long commonIndexOf(@NotNull com.applovin.shadow.okio.Buffer buffer, @NotNull ByteString bytes, long j8) {
        int i5;
        long j10 = j8;
        AbstractC3340k.e(buffer, "<this>");
        AbstractC3340k.e(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j10 >= 0) {
            Segment segment = buffer.head;
            if (segment == null) {
                return -1L;
            }
            if (buffer.size() - j10 < j10) {
                size = buffer.size();
                while (size > j10) {
                    segment = segment.prev;
                    AbstractC3340k.b(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b5 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (buffer.size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i5 = (int) ((segment.pos + j10) - size);
                    while (i5 < iMin) {
                        if (bArr[i5] != b5 || !rangeEquals(segment, i5 + 1, bArrInternalArray$okio, 1, size2)) {
                            i5++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC3340k.b(segment);
                    j10 = size;
                }
                return -1L;
            }
            while (true) {
                long j11 = (segment.limit - segment.pos) + size;
                if (j11 > j10) {
                    break;
                }
                segment = segment.next;
                AbstractC3340k.b(segment);
                size = j11;
            }
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b10 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (buffer.size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                long j12 = size5;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i5 = (int) ((segment.pos + j10) - size);
                while (i5 < iMin2) {
                    if (bArr2[i5] == b10 && rangeEquals(segment, i5 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i5++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC3340k.b(segment);
                size5 = j12;
                j10 = size;
            }
            return -1L;
            return (i5 - segment.pos) + size;
        }
        throw new IllegalArgumentException(AbstractC0279p0.k(j10, "fromIndex < 0: ").toString());
    }
}
