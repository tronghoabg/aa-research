package com.waze.ab.a;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class aa extends h.c.b.a.g implements h.g.a.p {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ad f13675a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Uri f13676b;

    /* renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f13677c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    aa(ad adVar, Uri uri, h.c.e eVar) {
        super(2, eVar);
        this.f13675a = adVar;
        this.f13676b = uri;
    }

    @Override // h.c.b.a.a
    public final h.c.e<h.ab> create(Object obj, h.c.e<?> eVar) {
        aa aaVar = new aa(this.f13675a, this.f13676b, eVar);
        aaVar.f13677c = obj;
        return aaVar;
    }

    @Override // h.g.a.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((aa) create((kotlinx.coroutines.af) obj, (h.c.e) obj2)).invokeSuspend(h.ab.f48028a);
    }

    @Override // h.c.b.a.a
    public final Object invokeSuspend(Object obj) throws IOException {
        h.c.a.a aVar = h.c.a.a.f48038a;
        e.b.c.b(obj);
        ad adVar = this.f13675a;
        if (adVar.f13693i == null) {
            File fileCreateTempFile = File.createTempFile("working_file", ".jpg", adVar.f13691g);
            h.g.b.x.e(fileCreateTempFile, "createTempFile(...)");
            adVar.f13693i = fileCreateTempFile;
        }
        File file = adVar.f13693i;
        File file2 = null;
        if (file == null) {
            h.g.b.x.j("workingFile");
            file = null;
        }
        adVar.f13695k = file;
        b bVar = adVar.f13689e;
        Context context = adVar.f13685a;
        Uri uri = this.f13676b;
        File file3 = adVar.f13693i;
        if (file3 == null) {
            h.g.b.x.j("workingFile");
            file3 = null;
        }
        String strB = bVar.b(context, uri, file3);
        if (strB == null) {
            return false;
        }
        adVar.f13688d.a(strB, adVar.o.b(), adVar.o.a());
        b bVar2 = adVar.f13689e;
        Context context2 = adVar.f13685a;
        File file4 = adVar.f13693i;
        if (file4 == null) {
            h.g.b.x.j("workingFile");
        } else {
            file2 = file4;
        }
        adVar.f13696l = bVar2.a(context2, file2);
        return Boolean.valueOf(adVar.f13696l != null);
    }
}
