package com.google.android.libraries.e.a;

import com.google.android.gms.o.ag;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class a extends com.google.android.libraries.e.a.b.a.c {

    /* renamed from: a, reason: collision with root package name */
    private final List f5808a;

    private a(InputStream inputStream, List list) {
        super(inputStream);
        this.f5808a = list;
        ag.i(true, "Input was null", new Object[0]);
    }

    public static a a(List list, InputStream inputStream) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.e.a.d.c cVarA = ((com.google.android.libraries.e.a.d.e) it.next()).a();
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a(inputStream, arrayList);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f5808a.iterator();
        while (it.hasNext()) {
            try {
                ((com.google.android.libraries.e.a.d.c) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i2 = this.in.read();
        if (i2 != -1) {
            Iterator it = this.f5808a.iterator();
            while (it.hasNext()) {
                ((com.google.android.libraries.e.a.d.c) it.next()).a();
            }
        }
        return i2;
    }

    @Override // com.google.android.libraries.e.a.b.a.c, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        int i2 = this.in.read(bArr);
        if (i2 != -1) {
            Iterator it = this.f5808a.iterator();
            while (it.hasNext()) {
                ((com.google.android.libraries.e.a.d.c) it.next()).a();
            }
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.in.read(bArr, i2, i3);
        if (i4 != -1) {
            Iterator it = this.f5808a.iterator();
            while (it.hasNext()) {
                ((com.google.android.libraries.e.a.d.c) it.next()).a();
            }
        }
        return i4;
    }
}
