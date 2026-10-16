package com.google.android.libraries.e.a;

import android.net.Uri;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.android.libraries.e.a.d.a f5840a;

    /* renamed from: b, reason: collision with root package name */
    private final List f5841b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5842c;

    /* renamed from: d, reason: collision with root package name */
    private final Uri f5843d;

    d(c cVar) {
        this.f5840a = cVar.f5833a;
        this.f5841b = cVar.f5834b;
        this.f5842c = cVar.f5835c;
        this.f5843d = cVar.f5837e;
    }

    public final Uri a() {
        return this.f5843d;
    }

    public final com.google.android.libraries.e.a.d.a b() {
        return this.f5840a;
    }

    public final List c(InputStream inputStream) {
        a aVarA;
        ArrayList arrayList = new ArrayList();
        arrayList.add(inputStream);
        List list = this.f5842c;
        if (!list.isEmpty() && (aVarA = a.a(list, inputStream)) != null) {
            arrayList.add(aVarA);
        }
        for (com.google.android.libraries.e.a.d.f fVar : this.f5841b) {
            arrayList.add(fVar.c());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final List d(OutputStream outputStream) {
        b bVarA;
        ArrayList arrayList = new ArrayList();
        arrayList.add(outputStream);
        List list = this.f5842c;
        if (!list.isEmpty() && (bVarA = b.a(list, outputStream)) != null) {
            arrayList.add(bVarA);
        }
        for (com.google.android.libraries.e.a.d.f fVar : this.f5841b) {
            arrayList.add(fVar.d());
        }
        Collections.reverse(arrayList);
        return arrayList;
    }

    public final boolean e() {
        return !this.f5841b.isEmpty();
    }
}
