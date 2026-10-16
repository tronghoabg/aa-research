package com.google.android.libraries.e.a;

import com.google.android.gms.o.ag;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class b extends com.google.android.libraries.e.a.b.a.d {

    /* renamed from: a, reason: collision with root package name */
    private final List f5825a;

    private b(OutputStream outputStream, List list) {
        super(outputStream);
        this.f5825a = list;
        ag.i(true, "Output was null", new Object[0]);
    }

    public static b a(List list, OutputStream outputStream) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.libraries.e.a.d.d dVarB = ((com.google.android.libraries.e.a.d.e) it.next()).b();
            if (dVarB != null) {
                arrayList.add(dVarB);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new b(outputStream, arrayList);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Iterator it = this.f5825a.iterator();
        while (it.hasNext()) {
            try {
                ((com.google.android.libraries.e.a.d.d) it.next()).close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // com.google.android.libraries.e.a.b.a.d, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        for (com.google.android.libraries.e.a.d.d dVar : this.f5825a) {
            int length = bArr.length;
            dVar.a();
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i2) throws IOException {
        this.out.write(i2);
        Iterator it = this.f5825a.iterator();
        while (it.hasNext()) {
            ((com.google.android.libraries.e.a.d.d) it.next()).a();
        }
    }

    @Override // com.google.android.libraries.e.a.b.a.d, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) throws IOException {
        this.out.write(bArr, i2, i3);
        Iterator it = this.f5825a.iterator();
        while (it.hasNext()) {
            ((com.google.android.libraries.e.a.d.d) it.next()).a();
        }
    }
}
