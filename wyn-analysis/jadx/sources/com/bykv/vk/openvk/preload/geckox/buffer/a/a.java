package com.bykv.vk.openvk.preload.geckox.buffer.a;

import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public String f24361a;

    /* renamed from: b, reason: collision with root package name */
    public String f24362b;

    /* renamed from: c, reason: collision with root package name */
    public String f24363c;

    /* renamed from: d, reason: collision with root package name */
    public String f24364d;

    /* renamed from: e, reason: collision with root package name */
    public String f24365e;

    /* renamed from: f, reason: collision with root package name */
    public String f24366f;

    /* renamed from: g, reason: collision with root package name */
    public int f24367g;

    public static com.bykv.vk.openvk.preload.geckox.buffer.a a(File file, long j8) throws IOException {
        com.bykv.vk.openvk.preload.geckox.buffer.a aVarB = b(file, j8);
        GeckoLogger.d("gecko-debug-tag", "buffer type:" + aVarB.getClass());
        return aVarB;
    }

    private static com.bykv.vk.openvk.preload.geckox.buffer.a b(File file, long j8) throws IOException {
        if (j8 <= 0) {
            try {
                return new b(file);
            } catch (Exception e7) {
                throw new IOException("create FileBuffer failed! file:" + file.getAbsolutePath() + " caused by:" + e7.getMessage(), e7);
            }
        }
        try {
            return new c(j8, file);
        } catch (Exception e10) {
            throw new RuntimeException("create random access file failed! file:" + file.getAbsolutePath() + " caused by:" + e10.getMessage(), e10);
        }
    }
}
