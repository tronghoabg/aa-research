package j$.nio.channels;

import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileLock;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-ef3156dd11616e3312fa97d164663e876a378324a977203425f20cc125230e5c */
/* loaded from: classes10.dex */
public abstract class c implements Channel {
    public abstract void e(boolean z);

    public abstract Future g(long j2, long j3, boolean z);

    public abstract void i(long j2, long j3, boolean z, Object obj, f fVar);

    public abstract Future j(ByteBuffer byteBuffer, long j2);

    public abstract void n(ByteBuffer byteBuffer, long j2, Object obj, f fVar);

    public abstract c p(long j2);

    public abstract FileLock q(long j2, long j3, boolean z);

    public abstract Future r(ByteBuffer byteBuffer, long j2);

    public abstract long size();

    public abstract void v(ByteBuffer byteBuffer, long j2, Object obj, f fVar);
}
