package com.bykv.vk.openvk.uef.uef.oa.uef;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.vk.openvk.uef.uef.oa.uef.uef.oa;
import com.bykv.vk.openvk.uef.uef.uef.yo.yo;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;

/* loaded from: classes.dex */
public class uef extends MediaDataSource {
    public static final ConcurrentHashMap<String, uef> uef = new ConcurrentHashMap<>();
    private final yo lw;
    private final Context moa;

    /* renamed from: oa, reason: collision with root package name */
    private final com.bykv.vk.openvk.uef.uef.oa.uef.uef.yo f24497oa;
    private long yo = -2147483648L;

    public uef(Context context, yo yoVar) {
        this.moa = context;
        this.lw = yoVar;
        this.f24497oa = new oa(yoVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.lw.ab();
        com.bykv.vk.openvk.uef.uef.oa.uef.uef.yo yoVar = this.f24497oa;
        if (yoVar != null) {
            yoVar.oa();
        }
        uef.remove(this.lw.bs());
    }

    @Override // android.media.MediaDataSource
    public long getSize() throws IOException {
        if (this.yo == -2147483648L) {
            if (this.moa == null || TextUtils.isEmpty(this.lw.ab())) {
                return -1L;
            }
            this.yo = this.f24497oa.yo();
        }
        return this.yo;
    }

    @Override // android.media.MediaDataSource
    public int readAt(long j8, byte[] bArr, int i5, int i10) throws IOException {
        int iUef = this.f24497oa.uef(j8, bArr, i5, i10);
        int length = bArr.length;
        return iUef;
    }

    public yo uef() {
        return this.lw;
    }

    public static uef uef(Context context, yo yoVar) {
        uef uefVar = new uef(context, yoVar);
        uef.put(yoVar.bs(), uefVar);
        return uefVar;
    }
}
