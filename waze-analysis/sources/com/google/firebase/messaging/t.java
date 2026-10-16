package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class t implements Closeable {

    /* renamed from: a, reason: collision with root package name */
    private final URL f10234a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Future f10235b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.android.gms.o.t f10236c;

    private t(URL url) {
        this.f10234a = url;
    }

    public static t b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new t(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: ".concat(String.valueOf(str)));
            return null;
        }
    }

    public static /* synthetic */ void c(t tVar, com.google.android.gms.o.w wVar) throws IOException {
        int i2;
        try {
            if (Log.isLoggable("FirebaseMessaging", 4)) {
                Log.i("FirebaseMessaging", "Starting download of: ".concat(tVar.f10234a.toString()));
            }
            URL url = tVar.f10234a;
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            if (uRLConnectionOpenConnection.getContentLength() > 1048576) {
                throw new IOException("Content-Length exceeds max size of 1048576");
            }
            InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
            try {
                a aVar = new a(inputStream);
                ArrayDeque arrayDeque = new ArrayDeque(20);
                int iHighestOneBit = Integer.highestOneBit(0);
                int iMin = Math.min(8192, Math.max(128, iHighestOneBit + iHighestOneBit));
                int i3 = 0;
                loop0: while (true) {
                    i2 = 2147483639;
                    if (i3 < 2147483639) {
                        int iMin2 = Math.min(iMin, 2147483639 - i3);
                        byte[] bArr = new byte[iMin2];
                        arrayDeque.add(bArr);
                        int i4 = 0;
                        while (i4 < iMin2) {
                            int i5 = aVar.read(bArr, i4, iMin2 - i4);
                            if (i5 == -1) {
                                i2 = i3;
                                break loop0;
                            } else {
                                i4 += i5;
                                i3 += i5;
                            }
                        }
                        long j2 = iMin * (iMin < 4096 ? 4 : 2);
                        iMin = j2 > SieveCacheKt.NodeLinkMask ? Integer.MAX_VALUE : j2 < SieveCacheKt.NodeMetaAndPreviousMask ? Integer.MIN_VALUE : (int) j2;
                    } else if (aVar.read() != -1) {
                        throw new OutOfMemoryError("input is too large to fit in a byte array");
                    }
                }
                byte[] bArrE = com.waze.c.c.e.e(arrayDeque, i2);
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + bArrE.length + " bytes from " + url.toString());
                }
                int length = bArrE.length;
                if (length > 1048576) {
                    throw new IOException("Image exceeds max size of 1048576");
                }
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrE, 0, length);
                if (bitmapDecodeByteArray == null) {
                    throw new IOException("Failed to decode image: ".concat(url.toString()));
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Successfully downloaded image: ".concat(url.toString()));
                }
                wVar.c(bitmapDecodeByteArray);
            } finally {
            }
        } catch (Exception e2) {
            wVar.b(e2);
        }
    }

    public final com.google.android.gms.o.t a() {
        com.google.android.gms.o.t tVar = this.f10236c;
        com.google.android.gms.common.api.internal.av.m(tVar);
        return tVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f10235b.cancel(true);
    }

    public final void d(ExecutorService executorService) {
        com.google.android.gms.o.w wVar = new com.google.android.gms.o.w();
        this.f10235b = executorService.submit(new android.support.v4.app.ac(this, wVar, 12));
        this.f10236c = wVar.a();
    }
}
