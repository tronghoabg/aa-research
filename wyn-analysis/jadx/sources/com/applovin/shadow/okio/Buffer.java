package com.applovin.shadow.okio;

import A7.AbstractC0279p0;
import Bf.a;
import R8.v;
import Va.M6;
import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import com.google.android.gms.common.api.f;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.vungle.ads.internal.protos.Sdk;
import ef.InterfaceC2519c;
import ff.m;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.apache.tika.fork.ForkServer;
import org.apache.tika.mime.MimeTypesReaderMetKeys;
import org.apache.tika.parser.external.ExternalParsersConfigReaderMetKeys;
import org.apache.tika.pipes.PipesConfigBase;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002Ï\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u001e\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u001f\u0010 J'\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010!J\u001f\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010\"J!\u0010#\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001a¢\u0006\u0004\b&\u0010'J\u001d\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b&\u0010(J\r\u0010)\u001a\u00020\u0011¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J\u0018\u00101\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0011H\u0087\u0002¢\u0006\u0004\b/\u00100J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00106\u001a\u000205H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u0010*J\u000f\u00109\u001a\u000202H\u0016¢\u0006\u0004\b9\u00104J\u000f\u0010:\u001a\u000205H\u0016¢\u0006\u0004\b:\u00107J\u000f\u0010;\u001a\u00020\u0011H\u0016¢\u0006\u0004\b;\u0010*J\u000f\u0010<\u001a\u00020\u0011H\u0016¢\u0006\u0004\b<\u0010*J\u000f\u0010=\u001a\u00020\u0011H\u0016¢\u0006\u0004\b=\u0010*J\u000f\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\u00020>2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010AJ\u0017\u0010D\u001a\u0002052\u0006\u0010C\u001a\u00020BH\u0016¢\u0006\u0004\bD\u0010EJ\u001f\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\u00112\u0006\u0010F\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010M\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bM\u0010OJ\u0017\u0010R\u001a\u00020L2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010R\u001a\u00020L2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\bR\u0010TJ\u0011\u0010U\u001a\u0004\u0018\u00010LH\u0016¢\u0006\u0004\bU\u0010NJ\u000f\u0010V\u001a\u00020LH\u0016¢\u0006\u0004\bV\u0010NJ\u0017\u0010V\u001a\u00020L2\u0006\u0010W\u001a\u00020\u0011H\u0016¢\u0006\u0004\bV\u0010OJ\u000f\u0010X\u001a\u000205H\u0016¢\u0006\u0004\bX\u00107J\u000f\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\bZ\u0010[J\u0017\u0010Z\u001a\u00020Y2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bZ\u0010\\J\u0017\u0010]\u001a\u0002052\u0006\u0010F\u001a\u00020YH\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010G\u001a\u00020\u00132\u0006\u0010F\u001a\u00020YH\u0016¢\u0006\u0004\bG\u0010_J'\u0010]\u001a\u0002052\u0006\u0010F\u001a\u00020Y2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\b]\u0010`J\u0017\u0010]\u001a\u0002052\u0006\u0010F\u001a\u00020aH\u0016¢\u0006\u0004\b]\u0010bJ\r\u0010c\u001a\u00020\u0013¢\u0006\u0004\bc\u0010\u0006J\u0017\u0010d\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bd\u0010\u0015J\u0017\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020>H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010f\u001a\u00020\u00002\u0006\u0010e\u001a\u00020>2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\bf\u0010hJ\u0017\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020LH\u0016¢\u0006\u0004\bj\u0010kJ'\u0010j\u001a\u00020\u00002\u0006\u0010i\u001a\u00020L2\u0006\u0010l\u001a\u0002052\u0006\u0010m\u001a\u000205H\u0016¢\u0006\u0004\bj\u0010nJ\u0017\u0010p\u001a\u00020\u00002\u0006\u0010o\u001a\u000205H\u0016¢\u0006\u0004\bp\u0010qJ\u001f\u0010r\u001a\u00020\u00002\u0006\u0010i\u001a\u00020L2\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\br\u0010sJ/\u0010r\u001a\u00020\u00002\u0006\u0010i\u001a\u00020L2\u0006\u0010l\u001a\u0002052\u0006\u0010m\u001a\u0002052\u0006\u0010Q\u001a\u00020PH\u0016¢\u0006\u0004\br\u0010tJ\u0017\u0010f\u001a\u00020\u00002\u0006\u0010u\u001a\u00020YH\u0016¢\u0006\u0004\bf\u0010vJ'\u0010f\u001a\u00020\u00002\u0006\u0010u\u001a\u00020Y2\u0006\u0010\u001e\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0004\bf\u0010wJ\u0017\u0010f\u001a\u0002052\u0006\u0010u\u001a\u00020aH\u0016¢\u0006\u0004\bf\u0010bJ\u0017\u0010y\u001a\u00020\u00112\u0006\u0010u\u001a\u00020xH\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010f\u001a\u00020\u00002\u0006\u0010u\u001a\u00020x2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bf\u0010{J\u0017\u0010}\u001a\u00020\u00002\u0006\u0010|\u001a\u000205H\u0016¢\u0006\u0004\b}\u0010qJ\u0017\u0010\u007f\u001a\u00020\u00002\u0006\u0010~\u001a\u000205H\u0016¢\u0006\u0004\b\u007f\u0010qJ\u0019\u0010\u0080\u0001\u001a\u00020\u00002\u0006\u0010~\u001a\u000205H\u0016¢\u0006\u0005\b\u0080\u0001\u0010qJ\u001a\u0010\u0082\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0082\u0001\u0010qJ\u001a\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0081\u0001\u001a\u000205H\u0016¢\u0006\u0005\b\u0083\u0001\u0010qJ\u001b\u0010\u0085\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001b\u0010\u0087\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0086\u0001J\u001b\u0010\u0088\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0086\u0001J\u001b\u0010\u0089\u0001\u001a\u00020\u00002\u0007\u0010\u0084\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0089\u0001\u0010\u0086\u0001J\u001c\u0010\u008e\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008a\u0001\u001a\u000205H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u001f\u0010f\u001a\u00020\u00132\u0006\u0010u\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\bf\u0010HJ \u0010]\u001a\u00020\u00112\u0006\u0010F\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0005\b]\u0010\u008f\u0001J\u001a\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020+H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J#\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020+2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0093\u0001J,\u0010\u0090\u0001\u001a\u00020\u00112\u0006\u0010|\u001a\u00020+2\u0007\u0010\u0092\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0095\u0001J\u001b\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0097\u0001J$\u0010\u0090\u0001\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0098\u0001J\u001b\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0097\u0001J$\u0010\u009a\u0001\u001a\u00020\u00112\u0007\u0010\u0099\u0001\u001a\u00020>2\u0007\u0010\u0092\u0001\u001a\u00020\u0011H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u0098\u0001J#\u0010\u009b\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J4\u0010\u009b\u0001\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u00112\u0007\u0010\u0096\u0001\u001a\u00020>2\u0007\u0010\u009d\u0001\u001a\u0002052\u0006\u0010\u0012\u001a\u000205H\u0016¢\u0006\u0006\b\u009b\u0001\u0010\u009e\u0001J\u0011\u0010\u009f\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b\u009f\u0001\u0010\u0006J\u0011\u0010 \u0001\u001a\u00020\u000eH\u0016¢\u0006\u0005\b \u0001\u0010\u0010J\u0011\u0010¡\u0001\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¡\u0001\u0010\u0006J\u0013\u0010£\u0001\u001a\u00030¢\u0001H\u0016¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u000f\u0010¥\u0001\u001a\u00020>¢\u0006\u0005\b¥\u0001\u0010@J\u000f\u0010¦\u0001\u001a\u00020>¢\u0006\u0005\b¦\u0001\u0010@J\u000f\u0010§\u0001\u001a\u00020>¢\u0006\u0005\b§\u0001\u0010@J\u000f\u0010¨\u0001\u001a\u00020>¢\u0006\u0005\b¨\u0001\u0010@J\u0019\u0010ª\u0001\u001a\u00020>2\u0007\u0010©\u0001\u001a\u00020>¢\u0006\u0006\bª\u0001\u0010«\u0001J\u0019\u0010¬\u0001\u001a\u00020>2\u0007\u0010©\u0001\u001a\u00020>¢\u0006\u0006\b¬\u0001\u0010«\u0001J\u0019\u0010\u00ad\u0001\u001a\u00020>2\u0007\u0010©\u0001\u001a\u00020>¢\u0006\u0006\b\u00ad\u0001\u0010«\u0001J\u001f\u0010°\u0001\u001a\u00020\u000e2\n\u0010¯\u0001\u001a\u0005\u0018\u00010®\u0001H\u0096\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u0011\u0010²\u0001\u001a\u000205H\u0016¢\u0006\u0005\b²\u0001\u00107J\u0011\u0010³\u0001\u001a\u00020LH\u0016¢\u0006\u0005\b³\u0001\u0010NJ\u000f\u0010´\u0001\u001a\u00020\u0000¢\u0006\u0005\b´\u0001\u0010\bJ\u0011\u0010µ\u0001\u001a\u00020\u0000H\u0016¢\u0006\u0005\bµ\u0001\u0010\bJ\u000f\u0010¶\u0001\u001a\u00020>¢\u0006\u0005\b¶\u0001\u0010@J\u0018\u0010¶\u0001\u001a\u00020>2\u0006\u0010\u0012\u001a\u000205¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001f\u0010º\u0001\u001a\u00030¸\u00012\n\b\u0002\u0010¹\u0001\u001a\u00030¸\u0001H\u0007¢\u0006\u0006\bº\u0001\u0010»\u0001J\u001f\u0010¼\u0001\u001a\u00030¸\u00012\n\b\u0002\u0010¹\u0001\u001a\u00030¸\u0001H\u0007¢\u0006\u0006\b¼\u0001\u0010»\u0001J\u0019\u0010/\u001a\u00020+2\u0007\u0010½\u0001\u001a\u00020\u0011H\u0007¢\u0006\u0005\b¾\u0001\u00100J\u0011\u0010À\u0001\u001a\u00020\u0011H\u0007¢\u0006\u0005\b¿\u0001\u0010*J)\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u00112\u0007\u0010Á\u0001\u001a\u00020\u000eH\u0002¢\u0006\u0005\b&\u0010Â\u0001J\u001b\u0010Ä\u0001\u001a\u00020>2\u0007\u0010Ã\u0001\u001a\u00020LH\u0002¢\u0006\u0006\bÄ\u0001\u0010Å\u0001J$\u0010Æ\u0001\u001a\u00020>2\u0007\u0010Ã\u0001\u001a\u00020L2\u0007\u0010©\u0001\u001a\u00020>H\u0002¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001R\u001c\u0010È\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R0\u0010À\u0001\u001a\u00020\u00112\u0007\u0010Ê\u0001\u001a\u00020\u00118G@@X\u0086\u000e¢\u0006\u0016\n\u0006\bÀ\u0001\u0010Ë\u0001\u001a\u0005\bÀ\u0001\u0010*\"\u0005\bÌ\u0001\u0010\u0015R\u0016\u0010\u0007\u001a\u00020\u00008VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010Î\u0001¨\u0006Ð\u0001"}, d2 = {"Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/BufferedSource;", "Lcom/applovin/shadow/okio/BufferedSink;", "", "Ljava/nio/channels/ByteChannel;", "<init>", "()V", "buffer", "()Lcom/applovin/shadow/okio/Buffer;", "Ljava/io/OutputStream;", "outputStream", "()Ljava/io/OutputStream;", "emitCompleteSegments", "emit", "", "exhausted", "()Z", "", "byteCount", "Lef/C;", "require", "(J)V", "request", "(J)Z", "peek", "()Lcom/applovin/shadow/okio/BufferedSource;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "out", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "copyTo", "(Ljava/io/OutputStream;JJ)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;JJ)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/Buffer;J)Lcom/applovin/shadow/okio/Buffer;", "writeTo", "(Ljava/io/OutputStream;J)Lcom/applovin/shadow/okio/Buffer;", "input", "readFrom", "(Ljava/io/InputStream;)Lcom/applovin/shadow/okio/Buffer;", "(Ljava/io/InputStream;J)Lcom/applovin/shadow/okio/Buffer;", "completeSegmentByteCount", "()J", "", "readByte", "()B", "pos", "getByte", "(J)B", "get", "", "readShort", "()S", "", "readInt", "()I", "readLong", "readShortLe", "readIntLe", "readLongLe", "readDecimalLong", "readHexadecimalUnsignedLong", "Lcom/applovin/shadow/okio/ByteString;", "readByteString", "()Lcom/applovin/shadow/okio/ByteString;", "(J)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Options;", "options", "select", "(Lcom/applovin/shadow/okio/Options;)I", "sink", "readFully", "(Lcom/applovin/shadow/okio/Buffer;J)V", "Lcom/applovin/shadow/okio/Sink;", "readAll", "(Lcom/applovin/shadow/okio/Sink;)J", "", "readUtf8", "()Ljava/lang/String;", "(J)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "charset", "readString", "(Ljava/nio/charset/Charset;)Ljava/lang/String;", "(JLjava/nio/charset/Charset;)Ljava/lang/String;", "readUtf8Line", "readUtf8LineStrict", "limit", "readUtf8CodePoint", "", "readByteArray", "()[B", "(J)[B", "read", "([B)I", "([B)V", "([BII)I", "Ljava/nio/ByteBuffer;", "(Ljava/nio/ByteBuffer;)I", "clear", "skip", "byteString", "write", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/Buffer;", "(Lcom/applovin/shadow/okio/ByteString;II)Lcom/applovin/shadow/okio/Buffer;", "string", "writeUtf8", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/Buffer;", "beginIndex", "endIndex", "(Ljava/lang/String;II)Lcom/applovin/shadow/okio/Buffer;", "codePoint", "writeUtf8CodePoint", "(I)Lcom/applovin/shadow/okio/Buffer;", "writeString", "(Ljava/lang/String;Ljava/nio/charset/Charset;)Lcom/applovin/shadow/okio/Buffer;", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Lcom/applovin/shadow/okio/Buffer;", "source", "([B)Lcom/applovin/shadow/okio/Buffer;", "([BII)Lcom/applovin/shadow/okio/Buffer;", "Lcom/applovin/shadow/okio/Source;", "writeAll", "(Lcom/applovin/shadow/okio/Source;)J", "(Lcom/applovin/shadow/okio/Source;J)Lcom/applovin/shadow/okio/Buffer;", "b", "writeByte", "s", "writeShort", "writeShortLe", "i", "writeInt", "writeIntLe", "v", "writeLong", "(J)Lcom/applovin/shadow/okio/Buffer;", "writeLongLe", "writeDecimalLong", "writeHexadecimalUnsignedLong", "minimumCapacity", "Lcom/applovin/shadow/okio/Segment;", "writableSegment$okio", "(I)Lcom/applovin/shadow/okio/Segment;", "writableSegment", "(Lcom/applovin/shadow/okio/Buffer;J)J", "indexOf", "(B)J", "fromIndex", "(BJ)J", "toIndex", "(BJJ)J", "bytes", "(Lcom/applovin/shadow/okio/ByteString;)J", "(Lcom/applovin/shadow/okio/ByteString;J)J", "targetBytes", "indexOfElement", "rangeEquals", "(JLcom/applovin/shadow/okio/ByteString;)Z", "bytesOffset", "(JLcom/applovin/shadow/okio/ByteString;II)Z", "flush", "isOpen", "close", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "md5", "sha1", "sha256", "sha512", ExternalParsersConfigReaderMetKeys.METADATA_KEY_ATTR, "hmacSha1", "(Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", "hmacSha256", "hmacSha512", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "copy", "clone", "snapshot", "(I)Lcom/applovin/shadow/okio/ByteString;", "Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "unsafeCursor", "readUnsafe", "(Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;)Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "readAndWriteUnsafe", "index", "-deprecated_getByte", "-deprecated_size", "size", "forever", "(Ljava/io/InputStream;JZ)V", "algorithm", "digest", "(Ljava/lang/String;)Lcom/applovin/shadow/okio/ByteString;", "hmac", "(Ljava/lang/String;Lcom/applovin/shadow/okio/ByteString;)Lcom/applovin/shadow/okio/ByteString;", "head", "Lcom/applovin/shadow/okio/Segment;", "<set-?>", "J", "setSize$okio", "getBuffer", "()Lcg/g;", "UnsafeCursor", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {

    @Nullable
    public Segment head;
    private long size;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b&\u0010%¨\u0006'"}, d2 = {"Lcom/applovin/shadow/okio/Buffer$UnsafeCursor;", "Ljava/io/Closeable;", "<init>", "()V", "", "next", "()I", "", MimeTypesReaderMetKeys.MATCH_OFFSET_ATTR, "seek", "(J)I", "newSize", "resizeBuffer", "(J)J", "minByteCount", "expandBuffer", "(I)J", "Lef/C;", "close", "Lcom/applovin/shadow/okio/Buffer;", "buffer", "Lcom/applovin/shadow/okio/Buffer;", "", "readWrite", "Z", "Lcom/applovin/shadow/okio/Segment;", "segment", "Lcom/applovin/shadow/okio/Segment;", "getSegment$okio", "()Lcg/C;", "setSegment$okio", "(Lcg/C;)V", "J", "", JsonStorageKeyNames.DATA_KEY, "[B", "start", "I", "end", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UnsafeCursor implements Closeable {

        @Nullable
        public Buffer buffer;

        @Nullable
        public byte[] data;
        public boolean readWrite;

        @Nullable
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final long expandBuffer(int minByteCount) {
            if (minByteCount <= 0) {
                throw new IllegalArgumentException(AbstractC3256n.g(minByteCount, "minByteCount <= 0: ").toString());
            }
            if (minByteCount > 8192) {
                throw new IllegalArgumentException(AbstractC3256n.g(minByteCount, "minByteCount > Segment.SIZE: ").toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(minByteCount);
            int i5 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = Segment.SIZE;
            long j8 = i5;
            buffer.setSize$okio(size + j8);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i5;
            this.end = Segment.SIZE;
            return j8;
        }

        @Nullable
        /* renamed from: getSegment$okio, reason: from getter */
        public final Segment getSegment() {
            return this.segment;
        }

        public final int next() {
            long j8 = this.offset;
            Buffer buffer = this.buffer;
            AbstractC3340k.b(buffer);
            if (j8 == buffer.size()) {
                throw new IllegalStateException("no more bytes");
            }
            long j10 = this.offset;
            return seek(j10 == -1 ? 0L : j10 + (this.end - this.start));
        }

        public final long resizeBuffer(long newSize) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers");
            }
            long size = buffer.size();
            if (newSize <= size) {
                if (newSize < 0) {
                    throw new IllegalArgumentException(AbstractC0279p0.k(newSize, "newSize < 0: ").toString());
                }
                long j8 = size - newSize;
                while (true) {
                    if (j8 <= 0) {
                        break;
                    }
                    Segment segment = buffer.head;
                    AbstractC3340k.b(segment);
                    Segment segment2 = segment.prev;
                    AbstractC3340k.b(segment2);
                    int i5 = segment2.limit;
                    long j10 = i5 - segment2.pos;
                    if (j10 > j8) {
                        segment2.limit = i5 - ((int) j8);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j8 -= j10;
                }
                setSegment$okio(null);
                this.offset = newSize;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (newSize > size) {
                long j11 = newSize - size;
                boolean z2 = true;
                while (j11 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(1);
                    int iMin = (int) Math.min(j11, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j11 -= iMin;
                    if (z2) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i10 = segmentWritableSegment$okio.limit;
                        this.start = i10 - iMin;
                        this.end = i10;
                        z2 = false;
                    }
                }
            }
            buffer.setSize$okio(newSize);
            return size;
        }

        public final int seek(long offset) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer");
            }
            if (offset < -1 || offset > buffer.size()) {
                StringBuilder sbU = M6.u(offset, "offset=", " > size=");
                sbU.append(buffer.size());
                throw new ArrayIndexOutOfBoundsException(sbU.toString());
            }
            if (offset == -1 || offset == buffer.size()) {
                setSegment$okio(null);
                this.offset = offset;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long size = buffer.size();
            Segment segment = buffer.head;
            long j8 = 0;
            if (getSegment() != null) {
                long j10 = this.offset;
                int i5 = this.start;
                AbstractC3340k.b(getSegment());
                long j11 = j10 - (i5 - r9.pos);
                if (j11 > offset) {
                    segmentPush = segment;
                    segment = getSegment();
                    size = j11;
                } else {
                    segmentPush = getSegment();
                    j8 = j11;
                }
            } else {
                segmentPush = segment;
            }
            if (size - offset > offset - j8) {
                while (true) {
                    AbstractC3340k.b(segmentPush);
                    int i10 = segmentPush.limit;
                    int i11 = segmentPush.pos;
                    if (offset < (i10 - i11) + j8) {
                        break;
                    }
                    j8 += i10 - i11;
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > offset) {
                    AbstractC3340k.b(segment);
                    segment = segment.prev;
                    AbstractC3340k.b(segment);
                    size -= segment.limit - segment.pos;
                }
                j8 = size;
                segmentPush = segment;
            }
            if (this.readWrite) {
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
            setSegment$okio(segmentPush);
            this.offset = offset;
            AbstractC3340k.b(segmentPush);
            this.data = segmentPush.data;
            int i12 = segmentPush.pos + ((int) (offset - j8));
            this.start = i12;
            int i13 = segmentPush.limit;
            this.end = i13;
            return i13 - i12;
        }

        public final void setSegment$okio(@Nullable Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j8, long j10, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j8 = 0;
        }
        long j11 = j8;
        if ((i5 & 4) != 0) {
            j10 = buffer.size - j11;
        }
        return buffer.copyTo(outputStream, j11, j10);
    }

    private final ByteString digest(String algorithm) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(algorithm);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i5 = segment.pos;
            messageDigest.update(bArr, i5, segment.limit - i5);
            Segment segment2 = segment.next;
            AbstractC3340k.b(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i10 = segment2.pos;
                messageDigest.update(bArr2, i10, segment2.limit - i10);
                segment2 = segment2.next;
                AbstractC3340k.b(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        AbstractC3340k.d(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String algorithm, ByteString key) throws IllegalStateException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            Mac mac = Mac.getInstance(algorithm);
            mac.init(new SecretKeySpec(key.internalArray$okio(), algorithm));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i5 = segment.pos;
                mac.update(bArr, i5, segment.limit - i5);
                Segment segment2 = segment.next;
                AbstractC3340k.b(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i10 = segment2.pos;
                    mac.update(bArr2, i10, segment2.limit - i10);
                    segment2 = segment2.next;
                    AbstractC3340k.b(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            AbstractC3340k.d(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e7) {
            throw new IllegalArgumentException(e7);
        }
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j8, int i5, Object obj) throws IOException {
        if ((i5 & 2) != 0) {
            j8 = buffer.size;
        }
        return buffer.writeTo(outputStream, j8);
    }

    @InterfaceC2519c
    /* renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m143deprecated_getByte(long index) {
        return getByte(index);
    }

    @InterfaceC2519c
    /* renamed from: -deprecated_size, reason: not valid java name and from getter */
    public final long getSize() {
        return this.size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    @NotNull
    /* renamed from: buffer */
    public Buffer getBufferField() {
        return this;
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        Segment segment2 = segment.prev;
        AbstractC3340k.b(segment2);
        return (segment2.limit >= 8192 || !segment2.owner) ? size : size - (r3 - segment2.pos);
    }

    @NotNull
    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() == 0) {
            return buffer;
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        Segment segmentSharedCopy = segment.sharedCopy();
        buffer.head = segmentSharedCopy;
        segmentSharedCopy.prev = segmentSharedCopy;
        segmentSharedCopy.next = segmentSharedCopy;
        for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
            Segment segment3 = segmentSharedCopy.prev;
            AbstractC3340k.b(segment3);
            AbstractC3340k.b(segment2);
            segment3.push(segment2.sharedCopy());
        }
        buffer.setSize$okio(size());
        return buffer;
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out) throws IOException {
        AbstractC3340k.e(out, "out");
        return copyTo$default(this, out, 0L, 0L, 6, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer emit() {
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer emitCompleteSegments() {
        return this;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Buffer)) {
            return false;
        }
        Buffer buffer = (Buffer) other;
        if (size() != buffer.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        Segment segment2 = buffer.head;
        AbstractC3340k.b(segment2);
        int i5 = segment.pos;
        int i10 = segment2.pos;
        long j8 = 0;
        while (j8 < size()) {
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

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.BufferedSource, com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer getBuffer() {
        return this;
    }

    public final byte getByte(long pos) {
        SegmentedByteString.checkOffsetAndCount(size(), pos, 1L);
        Segment segment = this.head;
        if (segment == null) {
            AbstractC3340k.b(null);
            throw null;
        }
        if (size() - pos < pos) {
            long size = size();
            while (size > pos) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            return segment.data[(int) ((segment.pos + pos) - size)];
        }
        long j8 = 0;
        while (true) {
            int i5 = segment.limit;
            int i10 = segment.pos;
            long j10 = (i5 - i10) + j8;
            if (j10 > pos) {
                return segment.data[(int) ((i10 + pos) - j8)];
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            j8 = j10;
        }
    }

    public int hashCode() {
        Segment segment = this.head;
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
        } while (segment != this.head);
        return i5;
    }

    @NotNull
    public final ByteString hmacSha1(@NotNull ByteString key) {
        AbstractC3340k.e(key, "key");
        return hmac("HmacSHA1", key);
    }

    @NotNull
    public final ByteString hmacSha256(@NotNull ByteString key) {
        AbstractC3340k.e(key, "key");
        return hmac("HmacSHA256", key);
    }

    @NotNull
    public final ByteString hmacSha512(@NotNull ByteString key) {
        AbstractC3340k.e(key, "key");
        return hmac("HmacSHA512", key);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b5) {
        return indexOf(b5, 0L, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes) {
        AbstractC3340k.e(targetBytes, "targetBytes");
        return indexOfElement(targetBytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public InputStream inputStream() {
        return new InputStream() { // from class: com.applovin.shadow.okio.Buffer.inputStream.1
            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), f.API_PRIORITY_OTHER);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & ForkServer.ERROR;
                }
                return -1;
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(@NotNull byte[] sink, int offset, int byteCount) {
                AbstractC3340k.e(sink, "sink");
                return Buffer.this.read(sink, offset, byteCount);
            }
        };
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @NotNull
    public final ByteString md5() {
        return digest("MD5");
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @NotNull
            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(int b5) {
                Buffer.this.writeByte(b5);
            }

            @Override // java.io.OutputStream
            public void write(@NotNull byte[] data, int offset, int byteCount) {
                AbstractC3340k.e(data, "data");
                Buffer.this.write(data, offset, byteCount);
            }
        };
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes) {
        AbstractC3340k.e(bytes, "bytes");
        return rangeEquals(offset, bytes, 0, bytes.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(@NotNull ByteBuffer sink) throws IOException {
        AbstractC3340k.e(sink, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(sink.remaining(), segment.limit - segment.pos);
        sink.put(segment.data, segment.pos, iMin);
        int i5 = segment.pos + iMin;
        segment.pos = i5;
        this.size -= iMin;
        if (i5 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readAll(@NotNull Sink sink) throws IOException {
        AbstractC3340k.e(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        int i11 = i5 + 1;
        byte b5 = segment.data[i5];
        setSize$okio(size() - 1);
        if (i11 != i10) {
            segment.pos = i11;
            return b5;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return b5;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public ByteString readByteString() {
        return readByteString(size());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r1 = new com.applovin.shadow.okio.Buffer().writeDecimalLong(r8).writeByte((int) r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        r1.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        throw new java.lang.NumberFormatException("Number too large: " + r1.readUtf8());
     */
    @Override // com.applovin.shadow.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readDecimalLong() throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readDecimalLong():long");
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input) throws IOException {
        AbstractC3340k.e(input, "input");
        readFrom(input, Long.MAX_VALUE, true);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(@NotNull Buffer sink, long byteCount) throws EOFException {
        AbstractC3340k.e(sink, "sink");
        if (size() >= byteCount) {
            sink.write(this, byteCount);
        } else {
            sink.write(this, size());
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a1 A[EDGE_INSN: B:43:0x00a1->B:37:0x00a1 BREAK  A[LOOP:0: B:5:0x000d->B:45:?], SYNTHETIC] */
    @Override // com.applovin.shadow.okio.BufferedSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long readHexadecimalUnsignedLong() throws java.io.EOFException {
        /*
            r14 = this;
            long r0 = r14.size()
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lab
            r0 = 0
            r1 = r0
            r4 = r2
        Ld:
            com.applovin.shadow.okio.Segment r6 = r14.head
            kotlin.jvm.internal.AbstractC3340k.b(r6)
            byte[] r7 = r6.data
            int r8 = r6.pos
            int r9 = r6.limit
        L18:
            if (r8 >= r9) goto L8d
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L27
            r11 = 57
            if (r10 > r11) goto L27
            int r11 = r10 + (-48)
            goto L3c
        L27:
            r11 = 97
            if (r10 < r11) goto L32
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L32
            int r11 = r10 + (-87)
            goto L3c
        L32:
            r11 = 65
            if (r10 < r11) goto L71
            r11 = 70
            if (r10 > r11) goto L71
            int r11 = r10 + (-55)
        L3c:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4c
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L18
        L4c:
            com.applovin.shadow.okio.Buffer r0 = new com.applovin.shadow.okio.Buffer
            r0.<init>()
            com.applovin.shadow.okio.Buffer r0 = r0.writeHexadecimalUnsignedLong(r4)
            com.applovin.shadow.okio.Buffer r0 = r0.writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Number too large: "
            r2.<init>(r3)
            java.lang.String r0 = r0.readUtf8()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L71:
            if (r0 == 0) goto L75
            r1 = 1
            goto L8d
        L75:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.<init>(r2)
            java.lang.String r2 = com.applovin.shadow.okio.SegmentedByteString.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L8d:
            if (r8 != r9) goto L99
            com.applovin.shadow.okio.Segment r7 = r6.pop()
            r14.head = r7
            com.applovin.shadow.okio.SegmentPool.recycle(r6)
            goto L9b
        L99:
            r6.pos = r8
        L9b:
            if (r1 != 0) goto La1
            com.applovin.shadow.okio.Segment r6 = r14.head
            if (r6 != 0) goto Ld
        La1:
            long r1 = r14.size()
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.setSize$okio(r1)
            return r4
        Lab:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.shadow.okio.Buffer.readHexadecimalUnsignedLong():long");
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() < 4) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 4) {
            return ((readByte() & ForkServer.ERROR) << 24) | ((readByte() & ForkServer.ERROR) << 16) | ((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR);
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 3;
        int i12 = ((bArr[i5 + 1] & ForkServer.ERROR) << 16) | ((bArr[i5] & ForkServer.ERROR) << 24) | ((bArr[i5 + 2] & ForkServer.ERROR) << 8);
        int i13 = i5 + 4;
        int i14 = (bArr[i11] & ForkServer.ERROR) | i12;
        setSize$okio(size() - 4);
        if (i13 != i10) {
            segment.pos = i13;
            return i14;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return i14;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() < 8) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 7;
        long j8 = ((bArr[i5 + 3] & 255) << 32) | ((bArr[i5] & 255) << 56) | ((bArr[i5 + 1] & 255) << 48) | ((bArr[i5 + 2] & 255) << 40) | ((bArr[i5 + 4] & 255) << 24) | ((bArr[i5 + 5] & 255) << 16) | ((bArr[i5 + 6] & 255) << 8);
        int i12 = i5 + 8;
        long j10 = j8 | (bArr[i11] & 255);
        setSize$okio(size() - 8);
        if (i12 != i10) {
            segment.pos = i12;
            return j10;
        }
        this.head = segment.pop();
        SegmentPool.recycle(segment);
        return j10;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() < 2) {
            throw new EOFException();
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        int i10 = segment.limit;
        if (i10 - i5 < 2) {
            return (short) (((readByte() & ForkServer.ERROR) << 8) | (readByte() & ForkServer.ERROR));
        }
        byte[] bArr = segment.data;
        int i11 = i5 + 1;
        int i12 = (bArr[i5] & ForkServer.ERROR) << 8;
        int i13 = i5 + 2;
        int i14 = (bArr[i11] & ForkServer.ERROR) | i12;
        setSize$okio(size() - 2);
        if (i13 == i10) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        } else {
            segment.pos = i13;
        }
        return (short) i14;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public String readString(@NotNull Charset charset) {
        AbstractC3340k.e(charset, "charset");
        return readString(this.size, charset);
    }

    @NotNull
    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public String readUtf8() {
        return readString(this.size, a.f1670a);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i5;
        int i10;
        int i11;
        if (size() == 0) {
            throw new EOFException();
        }
        byte b5 = getByte(0L);
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
                skip(1L);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i5 = b5 & 7;
            i10 = 4;
            i11 = 65536;
        }
        long j8 = i10;
        if (size() < j8) {
            StringBuilder sbL = pd.f.l(i10, "size < ", ": ");
            sbL.append(size());
            sbL.append(" (to read code point prefixed 0x");
            sbL.append(SegmentedByteString.toHexString(b5));
            sbL.append(')');
            throw new EOFException(sbL.toString());
        }
        for (int i12 = 1; i12 < i10; i12++) {
            long j10 = i12;
            byte b10 = getByte(j10);
            if ((b10 & 192) != 128) {
                skip(j10);
                return Utf8.REPLACEMENT_CODE_POINT;
            }
            i5 = (i5 << 6) | (b10 & Utf8.REPLACEMENT_BYTE);
        }
        skip(j8);
        return i5 > 1114111 ? Utf8.REPLACEMENT_CODE_POINT : ((55296 > i5 || i5 >= 57344) && i5 >= i11) ? i5 : Utf8.REPLACEMENT_CODE_POINT;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @Nullable
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean request(long byteCount) {
        return this.size >= byteCount;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void require(long byteCount) throws EOFException {
        if (this.size < byteCount) {
            throw new EOFException();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int select(@NotNull Options options) throws EOFException {
        AbstractC3340k.e(options, "options");
        int iSelectPrefix$default = com.applovin.shadow.okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j8) {
        this.size = j8;
    }

    @NotNull
    public final ByteString sha1() {
        return digest(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    @NotNull
    public final ByteString sha256() {
        return digest("SHA-256");
    }

    @NotNull
    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void skip(long byteCount) throws EOFException {
        while (byteCount > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(byteCount, segment.limit - segment.pos);
            long j8 = iMin;
            setSize$okio(size() - j8);
            byteCount -= j8;
            int i5 = segment.pos + iMin;
            segment.pos = i5;
            if (i5 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @NotNull
    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    @Override // com.applovin.shadow.okio.Source
    @NotNull
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @NotNull
    public String toString() {
        return snapshot().toString();
    }

    @NotNull
    public final Segment writableSegment$okio(int minimumCapacity) {
        if (minimumCapacity < 1 || minimumCapacity > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        Segment segment = this.head;
        if (segment != null) {
            AbstractC3340k.b(segment);
            Segment segment2 = segment.prev;
            AbstractC3340k.b(segment2);
            return (segment2.limit + minimumCapacity > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(@NotNull Source source) throws IOException {
        AbstractC3340k.e(source, "source");
        long j8 = 0;
        while (true) {
            long j10 = source.read(this, 8192L);
            if (j10 == -1) {
                return j8;
            }
            j8 += j10;
        }
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out) throws IOException {
        AbstractC3340k.e(out, "out");
        return writeTo$default(this, out, 0L, 2, null);
    }

    @NotNull
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Buffer m145clone() {
        return copy();
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long j8) throws IOException {
        AbstractC3340k.e(out, "out");
        return copyTo$default(this, out, j8, 0L, 4, (Object) null);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b5, long fromIndex) {
        return indexOf(b5, fromIndex, Long.MAX_VALUE);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOfElement(@NotNull ByteString targetBytes, long fromIndex) {
        int i5;
        int i10;
        AbstractC3340k.e(targetBytes, "targetBytes");
        long size = 0;
        if (fromIndex < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(fromIndex, "fromIndex < 0: ").toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            if (targetBytes.size() == 2) {
                byte b5 = targetBytes.getByte(0);
                byte b10 = targetBytes.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i5 = (int) ((segment.pos + fromIndex) - size);
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
                    fromIndex = size;
                }
            } else {
                byte[] bArrInternalArray$okio = targetBytes.internalArray$okio();
                while (size < size()) {
                    byte[] bArr2 = segment.data;
                    i5 = (int) ((segment.pos + fromIndex) - size);
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
                    fromIndex = size;
                }
            }
            return -1L;
        }
        while (true) {
            long j8 = (segment.limit - segment.pos) + size;
            if (j8 > fromIndex) {
                break;
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            size = j8;
        }
        if (targetBytes.size() == 2) {
            byte b14 = targetBytes.getByte(0);
            byte b15 = targetBytes.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i5 = (int) ((segment.pos + fromIndex) - size);
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
                fromIndex = size;
            }
        } else {
            byte[] bArrInternalArray$okio2 = targetBytes.internalArray$okio();
            while (size < size()) {
                byte[] bArr4 = segment.data;
                i5 = (int) ((segment.pos + fromIndex) - size);
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
                fromIndex = size;
            }
        }
        return -1L;
        return (i5 - i10) + size;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public boolean rangeEquals(long offset, @NotNull ByteString bytes, int bytesOffset, int byteCount) {
        AbstractC3340k.e(bytes, "bytes");
        if (offset < 0 || bytesOffset < 0 || byteCount < 0 || size() - offset < byteCount || bytes.size() - bytesOffset < byteCount) {
            return false;
        }
        for (int i5 = 0; i5 < byteCount; i5++) {
            if (getByte(i5 + offset) != bytes.getByte(bytesOffset + i5)) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final UnsafeCursor readAndWriteUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public byte[] readByteArray(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(byteCount, "byteCount: ").toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) byteCount];
        readFully(bArr);
        return bArr;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public ByteString readByteString(long byteCount) throws EOFException {
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(byteCount, "byteCount: ").toString());
        }
        if (size() < byteCount) {
            throw new EOFException();
        }
        if (byteCount < 4096) {
            return new ByteString(readByteArray(byteCount));
        }
        ByteString byteStringSnapshot = snapshot((int) byteCount);
        skip(byteCount);
        return byteStringSnapshot;
    }

    @NotNull
    public final Buffer readFrom(@NotNull InputStream input, long byteCount) throws IOException {
        AbstractC3340k.e(input, "input");
        if (byteCount < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(byteCount, "byteCount < 0: ").toString());
        }
        readFrom(input, byteCount, false);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public String readString(long byteCount, @NotNull Charset charset) throws EOFException {
        AbstractC3340k.e(charset, "charset");
        if (byteCount < 0 || byteCount > 2147483647L) {
            throw new IllegalArgumentException(AbstractC0279p0.k(byteCount, "byteCount: ").toString());
        }
        if (this.size < byteCount) {
            throw new EOFException();
        }
        if (byteCount == 0) {
            return "";
        }
        Segment segment = this.head;
        AbstractC3340k.b(segment);
        int i5 = segment.pos;
        if (i5 + byteCount > segment.limit) {
            return new String(readByteArray(byteCount), charset);
        }
        int i10 = (int) byteCount;
        String str = new String(segment.data, i5, i10, charset);
        int i11 = segment.pos + i10;
        segment.pos = i11;
        this.size -= byteCount;
        if (i11 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    @NotNull
    public final UnsafeCursor readUnsafe(@NotNull UnsafeCursor unsafeCursor) {
        AbstractC3340k.e(unsafeCursor, "unsafeCursor");
        return com.applovin.shadow.okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public String readUtf8(long byteCount) throws EOFException {
        return readString(byteCount, a.f1670a);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    @NotNull
    public String readUtf8LineStrict(long limit) throws EOFException {
        if (limit < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(limit, "limit < 0: ").toString());
        }
        long j8 = limit != Long.MAX_VALUE ? limit + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j8);
        if (jIndexOf != -1) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j8 < size() && getByte(j8 - 1) == 13 && getByte(j8) == 10) {
            return com.applovin.shadow.okio.internal.Buffer.readUtf8Line(this, j8);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), limit) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeByte(int b5) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i5 + 1;
        bArr[i5] = (byte) b5;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeDecimalLong(long v2) {
        boolean z2;
        if (v2 == 0) {
            return writeByte(48);
        }
        int i5 = 1;
        if (v2 < 0) {
            v2 = -v2;
            if (v2 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z2 = true;
        } else {
            z2 = false;
        }
        if (v2 >= 100000000) {
            i5 = v2 < 1000000000000L ? v2 < RealConnection.IDLE_CONNECTION_HEALTHY_NS ? v2 < 1000000000 ? 9 : 10 : v2 < 100000000000L ? 11 : 12 : v2 < 1000000000000000L ? v2 < 10000000000000L ? 13 : v2 < 100000000000000L ? 14 : 15 : v2 < 100000000000000000L ? v2 < 10000000000000000L ? 16 : 17 : v2 < 1000000000000000000L ? 18 : 19;
        } else if (v2 >= 10000) {
            i5 = v2 < 1000000 ? v2 < PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH ? 5 : 6 : v2 < 10000000 ? 7 : 8;
        } else if (v2 >= 100) {
            i5 = v2 < 1000 ? 3 : 4;
        } else if (v2 >= 10) {
            i5 = 2;
        }
        if (z2) {
            i5++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i5);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit + i5;
        while (v2 != 0) {
            long j8 = 10;
            i10--;
            bArr[i10] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (v2 % j8)];
            v2 /= j8;
        }
        if (z2) {
            bArr[i10 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i5;
        setSize$okio(size() + i5);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeHexadecimalUnsignedLong(long v2) {
        if (v2 == 0) {
            return writeByte(48);
        }
        long j8 = (v2 >>> 1) | v2;
        long j10 = j8 | (j8 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i5 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        Segment segmentWritableSegment$okio = writableSegment$okio(i5);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        for (int i11 = (i10 + i5) - 1; i11 >= i10; i11--) {
            bArr[i11] = com.applovin.shadow.okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & v2)];
            v2 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i5;
        setSize$okio(size() + i5);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeInt(int i5) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        bArr[i10] = (byte) ((i5 >>> 24) & 255);
        bArr[i10 + 1] = (byte) ((i5 >>> 16) & 255);
        bArr[i10 + 2] = (byte) ((i5 >>> 8) & 255);
        bArr[i10 + 3] = (byte) (i5 & 255);
        segmentWritableSegment$okio.limit = i10 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeIntLe(int i5) {
        return writeInt(SegmentedByteString.reverseBytes(i5));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeLong(long v2) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        bArr[i5] = (byte) ((v2 >>> 56) & 255);
        bArr[i5 + 1] = (byte) ((v2 >>> 48) & 255);
        bArr[i5 + 2] = (byte) ((v2 >>> 40) & 255);
        bArr[i5 + 3] = (byte) ((v2 >>> 32) & 255);
        bArr[i5 + 4] = (byte) ((v2 >>> 24) & 255);
        bArr[i5 + 5] = (byte) ((v2 >>> 16) & 255);
        bArr[i5 + 6] = (byte) ((v2 >>> 8) & 255);
        bArr[i5 + 7] = (byte) (v2 & 255);
        segmentWritableSegment$okio.limit = i5 + 8;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeLongLe(long v2) {
        return writeLong(SegmentedByteString.reverseBytes(v2));
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeShort(int s10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i5 = segmentWritableSegment$okio.limit;
        bArr[i5] = (byte) ((s10 >>> 8) & 255);
        bArr[i5 + 1] = (byte) (s10 & 255);
        segmentWritableSegment$okio.limit = i5 + 2;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeShortLe(int s10) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) s10));
    }

    @NotNull
    public final Buffer writeTo(@NotNull OutputStream out, long byteCount) throws IOException {
        AbstractC3340k.e(out, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, byteCount);
        Segment segment = this.head;
        long j8 = byteCount;
        while (j8 > 0) {
            AbstractC3340k.b(segment);
            int iMin = (int) Math.min(j8, segment.limit - segment.pos);
            out.write(segment.data, segment.pos, iMin);
            int i5 = segment.pos + iMin;
            segment.pos = i5;
            long j10 = iMin;
            this.size -= j10;
            j8 -= j10;
            if (i5 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeUtf8CodePoint(int codePoint) {
        if (codePoint < 128) {
            writeByte(codePoint);
            return this;
        }
        if (codePoint < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i5 = segmentWritableSegment$okio.limit;
            bArr[i5] = (byte) ((codePoint >> 6) | 192);
            bArr[i5 + 1] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio.limit = i5 + 2;
            setSize$okio(size() + 2);
            return this;
        }
        if (55296 <= codePoint && codePoint < 57344) {
            writeByte(63);
            return this;
        }
        if (codePoint < 65536) {
            Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
            byte[] bArr2 = segmentWritableSegment$okio2.data;
            int i10 = segmentWritableSegment$okio2.limit;
            bArr2[i10] = (byte) ((codePoint >> 12) | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
            bArr2[i10 + 1] = (byte) (((codePoint >> 6) & 63) | 128);
            bArr2[i10 + 2] = (byte) ((codePoint & 63) | 128);
            segmentWritableSegment$okio2.limit = i10 + 3;
            setSize$okio(size() + 3);
            return this;
        }
        if (codePoint > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(codePoint));
        }
        Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
        byte[] bArr3 = segmentWritableSegment$okio3.data;
        int i11 = segmentWritableSegment$okio3.limit;
        bArr3[i11] = (byte) ((codePoint >> 18) | 240);
        bArr3[i11 + 1] = (byte) (((codePoint >> 12) & 63) | 128);
        bArr3[i11 + 2] = (byte) (((codePoint >> 6) & 63) | 128);
        bArr3[i11 + 3] = (byte) ((codePoint & 63) | 128);
        segmentWritableSegment$okio3.limit = i11 + 4;
        setSize$okio(size() + 4);
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j8, long j10, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j8 = 0;
        }
        return buffer.copyTo(buffer2, j8, j10);
    }

    @NotNull
    public final Buffer copyTo(@NotNull OutputStream out, long offset, long byteCount) throws IOException {
        AbstractC3340k.e(out, "out");
        long j8 = offset;
        SegmentedByteString.checkOffsetAndCount(this.size, j8, byteCount);
        if (byteCount != 0) {
            Segment segment = this.head;
            while (true) {
                AbstractC3340k.b(segment);
                int i5 = segment.limit;
                int i10 = segment.pos;
                if (j8 < i5 - i10) {
                    break;
                }
                j8 -= i5 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j10 = byteCount;
            while (j10 > 0) {
                AbstractC3340k.b(segment2);
                int iMin = (int) Math.min(segment2.limit - r1, j10);
                out.write(segment2.data, (int) (segment2.pos + j8), iMin);
                j10 -= iMin;
                segment2 = segment2.next;
                j8 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes) throws IOException {
        AbstractC3340k.e(bytes, "bytes");
        return indexOf(bytes, 0L);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, @NotNull Charset charset) {
        AbstractC3340k.e(string, "string");
        AbstractC3340k.e(charset, "charset");
        return writeString(string, 0, string.length(), charset);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string) {
        AbstractC3340k.e(string, "string");
        return writeUtf8(string, 0, string.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j8, int i5, Object obj) {
        if ((i5 & 2) != 0) {
            j8 = 0;
        }
        return buffer.copyTo(buffer2, j8);
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(byte b5, long fromIndex, long toIndex) {
        Segment segment;
        int i5;
        long size = 0;
        if (0 > fromIndex || fromIndex > toIndex) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + fromIndex + " toIndex=" + toIndex).toString());
        }
        if (toIndex > size()) {
            toIndex = size();
        }
        if (fromIndex == toIndex || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - fromIndex < fromIndex) {
            size = size();
            while (size > fromIndex) {
                segment = segment.prev;
                AbstractC3340k.b(segment);
                size -= segment.limit - segment.pos;
            }
            while (size < toIndex) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (segment.pos + toIndex) - size);
                i5 = (int) ((segment.pos + fromIndex) - size);
                while (i5 < iMin) {
                    if (bArr[i5] != b5) {
                        i5++;
                    }
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC3340k.b(segment);
                fromIndex = size;
            }
            return -1L;
        }
        while (true) {
            long j8 = (segment.limit - segment.pos) + size;
            if (j8 > fromIndex) {
                break;
            }
            segment = segment.next;
            AbstractC3340k.b(segment);
            size = j8;
        }
        while (size < toIndex) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (segment.pos + toIndex) - size);
            i5 = (int) ((segment.pos + fromIndex) - size);
            while (i5 < iMin2) {
                if (bArr2[i5] != b5) {
                    i5++;
                }
            }
            size += segment.limit - segment.pos;
            segment = segment.next;
            AbstractC3340k.b(segment);
            fromIndex = size;
        }
        return -1L;
        return (i5 - segment.pos) + size;
    }

    @NotNull
    public final ByteString snapshot(int byteCount) {
        if (byteCount == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, byteCount);
        Segment segment = this.head;
        int i5 = 0;
        int i10 = 0;
        int i11 = 0;
        while (i10 < byteCount) {
            AbstractC3340k.b(segment);
            int i12 = segment.limit;
            int i13 = segment.pos;
            if (i12 != i13) {
                i10 += i12 - i13;
                i11++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i11][];
        int[] iArr = new int[i11 * 2];
        Segment segment2 = this.head;
        int i14 = 0;
        while (i5 < byteCount) {
            AbstractC3340k.b(segment2);
            bArr[i14] = segment2.data;
            i5 += segment2.limit - segment2.pos;
            iArr[i14] = Math.min(i5, byteCount);
            iArr[i14 + i11] = segment2.pos;
            segment2.shared = true;
            i14++;
            segment2 = segment2.next;
        }
        return new C1681SegmentedByteString(bArr, iArr);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeUtf8(@NotNull String string, int beginIndex, int endIndex) {
        char cCharAt;
        AbstractC3340k.e(string, "string");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(beginIndex, "beginIndex < 0: ").toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex > string.length()) {
                StringBuilder sbL = pd.f.l(endIndex, "endIndex > string.length: ", " > ");
                sbL.append(string.length());
                throw new IllegalArgumentException(sbL.toString().toString());
            }
            while (beginIndex < endIndex) {
                char cCharAt2 = string.charAt(beginIndex);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i5 = segmentWritableSegment$okio.limit - beginIndex;
                    int iMin = Math.min(endIndex, 8192 - i5);
                    int i10 = beginIndex + 1;
                    bArr[beginIndex + i5] = (byte) cCharAt2;
                    while (true) {
                        beginIndex = i10;
                        if (beginIndex >= iMin || (cCharAt = string.charAt(beginIndex)) >= 128) {
                            break;
                        }
                        i10 = beginIndex + 1;
                        bArr[beginIndex + i5] = (byte) cCharAt;
                    }
                    int i11 = segmentWritableSegment$okio.limit;
                    int i12 = (i5 + beginIndex) - i11;
                    segmentWritableSegment$okio.limit = i11 + i12;
                    setSize$okio(size() + i12);
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i13 = segmentWritableSegment$okio2.limit;
                        bArr2[i13] = (byte) ((cCharAt2 >> 6) | 192);
                        bArr2[i13 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i13 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i14 = beginIndex + 1;
                        char cCharAt3 = i14 < endIndex ? string.charAt(i14) : (char) 0;
                        if (cCharAt2 <= 56319 && 56320 <= cCharAt3 && cCharAt3 < 57344) {
                            int i15 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                            Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                            byte[] bArr3 = segmentWritableSegment$okio3.data;
                            int i16 = segmentWritableSegment$okio3.limit;
                            bArr3[i16] = (byte) ((i15 >> 18) | 240);
                            bArr3[i16 + 1] = (byte) (((i15 >> 12) & 63) | 128);
                            bArr3[i16 + 2] = (byte) (((i15 >> 6) & 63) | 128);
                            bArr3[i16 + 3] = (byte) ((i15 & 63) | 128);
                            segmentWritableSegment$okio3.limit = i16 + 4;
                            setSize$okio(size() + 4);
                            beginIndex += 2;
                        } else {
                            writeByte(63);
                            beginIndex = i14;
                        }
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i17 = segmentWritableSegment$okio4.limit;
                        bArr4[i17] = (byte) ((cCharAt2 >> '\f') | Sdk.SDKError.Reason.AD_LOAD_FAIL_EMPTY_BID_PAYLOAD_VALUE);
                        bArr4[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i17 + 3;
                        setSize$okio(size() + 3);
                    }
                    beginIndex++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(v.e(endIndex, beginIndex, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public void readFully(@NotNull byte[] sink) throws EOFException {
        AbstractC3340k.e(sink, "sink");
        int i5 = 0;
        while (i5 < sink.length) {
            int i10 = read(sink, i5, sink.length - i5);
            if (i10 == -1) {
                throw new EOFException();
            }
            i5 += i10;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer writeString(@NotNull String string, int beginIndex, int endIndex, @NotNull Charset charset) {
        AbstractC3340k.e(string, "string");
        AbstractC3340k.e(charset, "charset");
        if (beginIndex < 0) {
            throw new IllegalArgumentException(AbstractC3256n.g(beginIndex, "beginIndex < 0: ").toString());
        }
        if (endIndex >= beginIndex) {
            if (endIndex <= string.length()) {
                if (charset.equals(a.f1670a)) {
                    return writeUtf8(string, beginIndex, endIndex);
                }
                String strSubstring = string.substring(beginIndex, endIndex);
                AbstractC3340k.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                byte[] bytes = strSubstring.getBytes(charset);
                AbstractC3340k.d(bytes, "this as java.lang.String).getBytes(charset)");
                return write(bytes, 0, bytes.length);
            }
            StringBuilder sbL = pd.f.l(endIndex, "endIndex > string.length: ", " > ");
            sbL.append(string.length());
            throw new IllegalArgumentException(sbL.toString().toString());
        }
        throw new IllegalArgumentException(v.e(endIndex, beginIndex, "endIndex < beginIndex: ", " < ").toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(@NotNull ByteBuffer source) throws IOException {
        AbstractC3340k.e(source, "source");
        int iRemaining = source.remaining();
        int i5 = iRemaining;
        while (i5 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i5, 8192 - segmentWritableSegment$okio.limit);
            source.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i5 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += iRemaining;
        return iRemaining;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(@NotNull byte[] sink) {
        AbstractC3340k.e(sink, "sink");
        return read(sink, 0, sink.length);
    }

    private final void readFrom(InputStream input, long byteCount, boolean forever) throws IOException {
        while (true) {
            if (byteCount <= 0 && !forever) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i5 = input.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(byteCount, 8192 - segmentWritableSegment$okio.limit));
            if (i5 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!forever) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i5;
            long j8 = i5;
            this.size += j8;
            byteCount -= j8;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public int read(@NotNull byte[] sink, int offset, int byteCount) {
        AbstractC3340k.e(sink, "sink");
        SegmentedByteString.checkOffsetAndCount(sink.length, offset, byteCount);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteCount, segment.limit - segment.pos);
        byte[] bArr = segment.data;
        int i5 = segment.pos;
        m.f0(offset, i5, i5 + iMin, bArr, sink);
        segment.pos += iMin;
        setSize$okio(size() - iMin);
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset) {
        AbstractC3340k.e(out, "out");
        return copyTo(out, offset, this.size - offset);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString) {
        AbstractC3340k.e(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @NotNull
    public final Buffer copyTo(@NotNull Buffer out, long offset, long byteCount) {
        AbstractC3340k.e(out, "out");
        long j8 = offset;
        SegmentedByteString.checkOffsetAndCount(size(), j8, byteCount);
        if (byteCount != 0) {
            out.setSize$okio(out.size() + byteCount);
            Segment segment = this.head;
            while (true) {
                AbstractC3340k.b(segment);
                int i5 = segment.limit;
                int i10 = segment.pos;
                if (j8 < i5 - i10) {
                    break;
                }
                j8 -= i5 - i10;
                segment = segment.next;
            }
            Segment segment2 = segment;
            long j10 = byteCount;
            while (j10 > 0) {
                AbstractC3340k.b(segment2);
                Segment segmentSharedCopy = segment2.sharedCopy();
                int i11 = segmentSharedCopy.pos + ((int) j8);
                segmentSharedCopy.pos = i11;
                segmentSharedCopy.limit = Math.min(i11 + ((int) j10), segmentSharedCopy.limit);
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
                j10 -= segmentSharedCopy.limit - segmentSharedCopy.pos;
                segment2 = segment2.next;
                j8 = 0;
            }
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull ByteString byteString, int offset, int byteCount) {
        AbstractC3340k.e(byteString, "byteString");
        byteString.write$okio(this, offset, byteCount);
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source) {
        AbstractC3340k.e(source, "source");
        return write(source, 0, source.length);
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull byte[] source, int offset, int byteCount) {
        AbstractC3340k.e(source, "source");
        long j8 = byteCount;
        SegmentedByteString.checkOffsetAndCount(source.length, offset, j8);
        int i5 = byteCount + offset;
        while (offset < i5) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i5 - offset, 8192 - segmentWritableSegment$okio.limit);
            int i10 = offset + iMin;
            m.f0(segmentWritableSegment$okio.limit, offset, i10, source, segmentWritableSegment$okio.data);
            segmentWritableSegment$okio.limit += iMin;
            offset = i10;
        }
        setSize$okio(size() + j8);
        return this;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(@NotNull Buffer sink, long byteCount) {
        AbstractC3340k.e(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(AbstractC0279p0.k(byteCount, "byteCount < 0: ").toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (byteCount > size()) {
            byteCount = size();
        }
        sink.write(this, byteCount);
        return byteCount;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    @NotNull
    public Buffer write(@NotNull Source source, long byteCount) throws IOException {
        AbstractC3340k.e(source, "source");
        while (byteCount > 0) {
            long j8 = source.read(this, byteCount);
            if (j8 == -1) {
                throw new EOFException();
            }
            byteCount -= j8;
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSource
    public long indexOf(@NotNull ByteString bytes, long fromIndex) throws IOException {
        int i5;
        long j8 = fromIndex;
        AbstractC3340k.e(bytes, "bytes");
        if (bytes.size() <= 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long size = 0;
        if (j8 >= 0) {
            Segment segment = this.head;
            if (segment == null) {
                return -1L;
            }
            if (size() - j8 < j8) {
                size = size();
                while (size > j8) {
                    segment = segment.prev;
                    AbstractC3340k.b(segment);
                    size -= segment.limit - segment.pos;
                }
                byte[] bArrInternalArray$okio = bytes.internalArray$okio();
                byte b5 = bArrInternalArray$okio[0];
                int size2 = bytes.size();
                long size3 = (size() - size2) + 1;
                while (size < size3) {
                    byte[] bArr = segment.data;
                    long j10 = size3;
                    int iMin = (int) Math.min(segment.limit, (segment.pos + size3) - size);
                    i5 = (int) ((segment.pos + j8) - size);
                    while (i5 < iMin) {
                        if (bArr[i5] != b5 || !com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i5 + 1, bArrInternalArray$okio, 1, size2)) {
                            i5++;
                        }
                    }
                    size += segment.limit - segment.pos;
                    segment = segment.next;
                    AbstractC3340k.b(segment);
                    j8 = size;
                    size3 = j10;
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
            byte[] bArrInternalArray$okio2 = bytes.internalArray$okio();
            byte b10 = bArrInternalArray$okio2[0];
            int size4 = bytes.size();
            long size5 = (size() - size4) + 1;
            while (size < size5) {
                byte[] bArr2 = segment.data;
                int iMin2 = (int) Math.min(segment.limit, (segment.pos + size5) - size);
                i5 = (int) ((segment.pos + j8) - size);
                while (i5 < iMin2) {
                    if (bArr2[i5] == b10 && com.applovin.shadow.okio.internal.Buffer.rangeEquals(segment, i5 + 1, bArrInternalArray$okio2, 1, size4)) {
                    }
                    i5++;
                }
                size += segment.limit - segment.pos;
                segment = segment.next;
                AbstractC3340k.b(segment);
                j8 = size;
            }
            return -1L;
            return (i5 - segment.pos) + size;
        }
        throw new IllegalArgumentException(AbstractC0279p0.k(j8, "fromIndex < 0: ").toString());
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(@NotNull Buffer source, long byteCount) {
        Segment segment;
        AbstractC3340k.e(source, "source");
        if (source != this) {
            SegmentedByteString.checkOffsetAndCount(source.size(), 0L, byteCount);
            while (byteCount > 0) {
                Segment segment2 = source.head;
                AbstractC3340k.b(segment2);
                int i5 = segment2.limit;
                AbstractC3340k.b(source.head);
                if (byteCount < i5 - r1.pos) {
                    Segment segment3 = this.head;
                    if (segment3 != null) {
                        AbstractC3340k.b(segment3);
                        segment = segment3.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((segment.limit + byteCount) - (segment.shared ? 0 : segment.pos) <= 8192) {
                            Segment segment4 = source.head;
                            AbstractC3340k.b(segment4);
                            segment4.writeTo(segment, (int) byteCount);
                            source.setSize$okio(source.size() - byteCount);
                            setSize$okio(size() + byteCount);
                            return;
                        }
                    }
                    Segment segment5 = source.head;
                    AbstractC3340k.b(segment5);
                    source.head = segment5.split((int) byteCount);
                }
                Segment segment6 = source.head;
                AbstractC3340k.b(segment6);
                long j8 = segment6.limit - segment6.pos;
                source.head = segment6.pop();
                Segment segment7 = this.head;
                if (segment7 == null) {
                    this.head = segment6;
                    segment6.prev = segment6;
                    segment6.next = segment6;
                } else {
                    AbstractC3340k.b(segment7);
                    Segment segment8 = segment7.prev;
                    AbstractC3340k.b(segment8);
                    segment8.push(segment6).compact();
                }
                source.setSize$okio(source.size() - j8);
                setSize$okio(size() + j8);
                byteCount -= j8;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }
}
