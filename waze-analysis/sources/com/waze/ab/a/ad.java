package com.waze.ab.a;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.io.IOException;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.b.bm;
import kotlinx.coroutines.b.bq;
import kotlinx.coroutines.b.bu;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ad implements com.waze.ui.r.a.b.a, n {

    /* renamed from: a, reason: collision with root package name */
    private final Context f13685a;

    /* renamed from: b, reason: collision with root package name */
    private final com.waze.shared_infra.j.a f13686b;

    /* renamed from: c, reason: collision with root package name */
    private final ae f13687c;

    /* renamed from: d, reason: collision with root package name */
    private final d f13688d;

    /* renamed from: e, reason: collision with root package name */
    private final b f13689e;

    /* renamed from: f, reason: collision with root package name */
    private final kotlinx.coroutines.af f13690f;

    /* renamed from: g, reason: collision with root package name */
    private final File f13691g;

    /* renamed from: h, reason: collision with root package name */
    private File f13692h;

    /* renamed from: i, reason: collision with root package name */
    private File f13693i;

    /* renamed from: j, reason: collision with root package name */
    private File f13694j;

    /* renamed from: k, reason: collision with root package name */
    private File f13695k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f13696l;
    private Uri m;
    private final bm n;
    private final q o;
    private final bq p;
    private boolean q;

    public ad(Context context, com.waze.shared_infra.j.a aVar, ae aeVar, d dVar, b bVar) {
        h.g.b.x.f(context, "applicationContext");
        h.g.b.x.f(aVar, "permissionChecker");
        h.g.b.x.f(aeVar, "repository");
        h.g.b.x.f(dVar, "imageUtils");
        h.g.b.x.f(bVar, "fileUtils");
        this.f13685a = context;
        this.f13686b = aVar;
        this.f13687c = aeVar;
        this.f13688d = dVar;
        this.f13689e = bVar;
        this.f13690f = com.waze.ui.a.l.p(this, null);
        h.g.b.x.f(context, "context");
        File cacheDir = context.getCacheDir();
        h.g.b.x.e(cacheDir, "getCacheDir(...)");
        this.f13691g = cacheDir;
        bm bmVarE = bu.e(0, 0, null, 7);
        this.n = bmVarE;
        this.o = new q(null);
        this.p = bmVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D() {
        aj.z(this.f13690f, null, null, new y(this, (h.c.e) null, 0), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        File file = this.f13692h;
        if (file == null) {
            h.g.b.x.j("finalFile");
            file = null;
        }
        ae aeVar = this.f13687c;
        String absolutePath = file.getAbsolutePath();
        h.g.b.x.e(absolutePath, "getAbsolutePath(...)");
        aeVar.b(absolutePath);
        D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        File file = this.f13692h;
        if (file == null) {
            File file2 = new File(this.f13691g, "final_user_image.jpg");
            this.f13692h = file2;
            file = file2;
        }
        Uri uri = this.f13696l;
        b bVar = this.f13689e;
        Context context = this.f13685a;
        if (file == null) {
            h.g.b.x.j("finalFile");
            file = null;
        }
        Uri uriA = bVar.a(context, file);
        if (uriA == null || uri == null) {
            D();
        } else {
            aj.z(this.f13690f, null, null, new ac(this, uri, uriA, null), 3);
        }
    }

    private final void G() {
        aj.z(this.f13690f, null, null, new y(this, (h.c.e) null, 5, (int[]) null), 3);
    }

    public final void B() {
        aj.z(this.f13690f, null, null, new y(this, (h.c.e) null, 6, (boolean[]) null), 3);
        this.q = true;
    }

    public final boolean C() {
        if (!this.q) {
            return false;
        }
        D();
        return true;
    }

    @Override // com.waze.ab.a.n
    public final bq a() {
        return this.p;
    }

    @Override // com.waze.ab.a.n
    public final void b() {
        aj.z(this.f13690f, null, null, new y(this, (h.c.e) null, 2, (byte[]) null), 3);
    }

    @Override // com.waze.ab.a.n
    public final void c() {
        this.q = false;
    }

    @Override // com.waze.ui.r.a.b.a, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        File file = this.f13693i;
        if (file != null) {
            com.waze.sharedui.utils.f.g(file);
        }
        File file2 = this.f13694j;
        if (file2 != null) {
            com.waze.sharedui.utils.f.g(file2);
        }
        aj.h(this.f13690f, null);
    }

    @Override // com.waze.ab.a.n
    public final void d(boolean z) {
        if (z) {
            G();
        } else {
            D();
        }
    }

    @Override // com.waze.ab.a.n
    public final void e() {
        aj.z(this.f13690f, null, null, new y(this, (h.c.e) null, 3, (char[]) null), 3);
    }

    @Override // com.waze.ab.a.n
    public final void f(Uri uri) {
        if (uri != null) {
            E();
        } else {
            D();
        }
    }

    @Override // com.waze.ab.a.n
    public final void g(Uri uri) {
        if (uri == null) {
            D();
        } else {
            aj.z(this.f13690f, null, null, new ab(this, uri, null), 3);
        }
    }

    @Override // com.waze.ab.a.n
    public final void h(boolean z) {
        if (!z) {
            D();
            return;
        }
        Uri uri = this.m;
        if (uri == null) {
            h.g.b.x.j("photoUri");
            uri = null;
        }
        this.f13696l = uri;
        F();
    }

    @Override // com.waze.ab.a.n
    public final void i() throws IOException {
        File fileCreateTempFile = this.f13694j;
        if (fileCreateTempFile == null) {
            fileCreateTempFile = File.createTempFile("user_photo", ".jpg", this.f13691g);
            h.g.b.x.e(fileCreateTempFile, "createTempFile(...)");
            this.f13694j = fileCreateTempFile;
        }
        if (fileCreateTempFile == null) {
            h.g.b.x.j("userPhoto");
            fileCreateTempFile = null;
        }
        this.f13695k = fileCreateTempFile;
        b bVar = this.f13689e;
        Context context = this.f13685a;
        File file = this.f13694j;
        if (file == null) {
            h.g.b.x.j("userPhoto");
            file = null;
        }
        Uri uriA = bVar.a(context, file);
        if (uriA == null) {
            D();
            return;
        }
        this.m = uriA;
        if (this.f13686b.a("android.permission.CAMERA")) {
            G();
        } else {
            aj.z(this.f13690f, null, null, new y(this, (h.c.e) null, 4, (short[]) null), 3);
        }
    }
}
