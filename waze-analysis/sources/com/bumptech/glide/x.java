package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.b.ae;
import com.bumptech.glide.load.b.am;
import com.bumptech.glide.load.b.an;
import com.bumptech.glide.load.b.ap;
import com.bumptech.glide.load.b.ar;
import com.bumptech.glide.load.b.aw;
import com.bumptech.glide.load.b.ay;
import com.bumptech.glide.load.c.a.aj;
import com.bumptech.glide.load.c.a.al;
import com.bumptech.glide.load.c.a.ao;
import com.bumptech.glide.load.c.a.aq;
import com.bumptech.glide.load.c.a.au;
import com.bumptech.glide.load.c.a.bc;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class x {
    static v a(c cVar, List list) {
        com.bumptech.glide.load.u lVar;
        com.bumptech.glide.load.u aqVar;
        com.bumptech.glide.load.a.a.j jVar;
        com.bumptech.glide.load.a.a.c cVarH = cVar.h();
        com.bumptech.glide.load.a.a.j jVarL = cVar.l();
        Context applicationContext = cVar.c().getApplicationContext();
        o oVarB = cVar.c().b();
        v vVar = new v();
        vVar.n(new com.bumptech.glide.load.c.a.m());
        vVar.n(new com.bumptech.glide.load.c.a.aa());
        Resources resources = applicationContext.getResources();
        List listE = vVar.e();
        com.bumptech.glide.load.c.d.b bVar = new com.bumptech.glide.load.c.d.b(applicationContext, listE, cVarH, jVarL);
        com.bumptech.glide.load.u uVarE = bc.e(cVarH);
        com.bumptech.glide.load.c.a.w wVar = new com.bumptech.glide.load.c.a.w(vVar.e(), resources.getDisplayMetrics(), cVarH, jVarL);
        if (oVarB.b(e.class)) {
            aqVar = new aj(oVarB.b(j.class), jVarL, oVarB.b(i.class));
            lVar = new com.bumptech.glide.load.c.a.f();
        } else {
            lVar = new com.bumptech.glide.load.c.d.l(wVar, 1);
            aqVar = new aq(wVar, jVarL);
        }
        vVar.m("Animation", InputStream.class, Drawable.class, com.bumptech.glide.load.c.c.c.d(listE, jVarL));
        vVar.m("Animation", ByteBuffer.class, Drawable.class, com.bumptech.glide.load.c.c.c.c(listE, jVarL));
        com.bumptech.glide.load.c.c.g gVar = new com.bumptech.glide.load.c.c.g(applicationContext);
        com.bumptech.glide.load.c.a.c cVar2 = new com.bumptech.glide.load.c.a.c(jVarL);
        com.bumptech.glide.load.c.e.a aVar = new com.bumptech.glide.load.c.e.a(1);
        com.bumptech.glide.load.c.e.f fVar = new com.bumptech.glide.load.c.e.f(1);
        ContentResolver contentResolver = applicationContext.getContentResolver();
        vVar.i(ByteBuffer.class, new com.bumptech.glide.load.b.g());
        vVar.i(InputStream.class, new com.bumptech.glide.load.b.aq(jVarL));
        vVar.m("Bitmap", ByteBuffer.class, Bitmap.class, lVar);
        vVar.m("Bitmap", InputStream.class, Bitmap.class, aqVar);
        if (com.bumptech.glide.load.data.s.d()) {
            jVar = jVarL;
            vVar.m("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new al(wVar));
        } else {
            jVar = jVarL;
        }
        vVar.m("Bitmap", AssetFileDescriptor.class, Bitmap.class, bc.c(cVarH));
        vVar.m("Bitmap", ParcelFileDescriptor.class, Bitmap.class, uVarE);
        vVar.l(Bitmap.class, Bitmap.class, ay.a());
        vVar.m("Bitmap", Bitmap.class, Bitmap.class, new au(0));
        vVar.j(Bitmap.class, cVar2);
        vVar.m("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.c.a.a(resources, lVar));
        vVar.m("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.c.a.a(resources, aqVar));
        vVar.m("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.c.a.a(resources, uVarE));
        vVar.j(BitmapDrawable.class, new com.bumptech.glide.load.c.a.b(cVarH, cVar2));
        com.bumptech.glide.load.a.a.j jVar2 = jVar;
        vVar.m("Animation", InputStream.class, com.bumptech.glide.load.c.d.e.class, new com.bumptech.glide.load.c.d.n(listE, bVar, jVar2));
        vVar.m("Animation", ByteBuffer.class, com.bumptech.glide.load.c.d.e.class, bVar);
        vVar.j(com.bumptech.glide.load.c.d.e.class, new com.bumptech.glide.load.c.d.f());
        vVar.l(com.bumptech.glide.b.a.class, com.bumptech.glide.b.a.class, ay.a());
        vVar.m("Bitmap", com.bumptech.glide.b.a.class, Bitmap.class, new com.bumptech.glide.load.c.d.l(cVarH, 0));
        vVar.k(Uri.class, Drawable.class, gVar);
        vVar.k(Uri.class, Bitmap.class, new ao(gVar, cVarH));
        vVar.o(new com.bumptech.glide.load.c.b.a());
        vVar.l(File.class, ByteBuffer.class, new com.bumptech.glide.load.b.f(2));
        vVar.l(File.class, InputStream.class, new com.bumptech.glide.load.b.o((byte[]) null, 0));
        vVar.k(File.class, File.class, new au(1));
        vVar.l(File.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.b.o(0));
        vVar.l(File.class, File.class, ay.a());
        vVar.o(new com.bumptech.glide.load.data.o(jVar2));
        if (com.bumptech.glide.load.data.s.d()) {
            vVar.o(new com.bumptech.glide.load.data.r());
        }
        ae aeVarE = com.bumptech.glide.load.b.n.e(applicationContext);
        ae aeVarC = com.bumptech.glide.load.b.n.c(applicationContext);
        ae aeVarD = com.bumptech.glide.load.b.n.d(applicationContext);
        vVar.l(Integer.TYPE, InputStream.class, aeVarE);
        vVar.l(Integer.class, InputStream.class, aeVarE);
        vVar.l(Integer.TYPE, AssetFileDescriptor.class, aeVarC);
        vVar.l(Integer.class, AssetFileDescriptor.class, aeVarC);
        vVar.l(Integer.TYPE, Drawable.class, aeVarD);
        vVar.l(Integer.class, Drawable.class, aeVarD);
        vVar.l(Uri.class, InputStream.class, ap.d(applicationContext));
        vVar.l(Uri.class, AssetFileDescriptor.class, ap.c(applicationContext));
        an anVar = new an(resources, 2);
        am amVar = new am(resources);
        an anVar2 = new an(resources, 0);
        vVar.l(Integer.class, Uri.class, anVar);
        vVar.l(Integer.TYPE, Uri.class, anVar);
        vVar.l(Integer.class, AssetFileDescriptor.class, amVar);
        vVar.l(Integer.TYPE, AssetFileDescriptor.class, amVar);
        vVar.l(Integer.class, InputStream.class, anVar2);
        vVar.l(Integer.TYPE, InputStream.class, anVar2);
        vVar.l(String.class, InputStream.class, new com.bumptech.glide.load.b.o(1, (byte[]) null));
        vVar.l(Uri.class, InputStream.class, new com.bumptech.glide.load.b.o(1, (byte[]) null));
        vVar.l(String.class, InputStream.class, new com.bumptech.glide.load.b.f(4));
        vVar.l(String.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.b.f(3));
        vVar.l(String.class, AssetFileDescriptor.class, new ar());
        vVar.l(Uri.class, InputStream.class, new com.bumptech.glide.load.b.b(applicationContext.getAssets(), 0));
        vVar.l(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.load.b.b(applicationContext.getAssets(), 1));
        vVar.l(Uri.class, InputStream.class, new an(applicationContext, 4));
        vVar.l(Uri.class, InputStream.class, new an(applicationContext, 5));
        vVar.l(Uri.class, InputStream.class, new com.bumptech.glide.load.b.a.d(applicationContext));
        vVar.l(Uri.class, ParcelFileDescriptor.class, new com.bumptech.glide.load.b.a.d(applicationContext, null));
        boolean zB = oVarB.b(k.class);
        vVar.l(Uri.class, InputStream.class, new aw(contentResolver, zB, 0));
        vVar.l(Uri.class, ParcelFileDescriptor.class, new aw(contentResolver, zB, 1));
        vVar.l(Uri.class, AssetFileDescriptor.class, new com.bumptech.glide.load.b.au(contentResolver, zB));
        vVar.l(Uri.class, InputStream.class, new ay(0));
        vVar.l(URL.class, InputStream.class, new ay(2));
        vVar.l(Uri.class, File.class, new an(applicationContext, 1));
        vVar.l(com.bumptech.glide.load.b.t.class, InputStream.class, new an(3));
        vVar.l(byte[].class, ByteBuffer.class, new com.bumptech.glide.load.b.f(1));
        vVar.l(byte[].class, InputStream.class, new com.bumptech.glide.load.b.f(0));
        vVar.l(Uri.class, Uri.class, ay.a());
        vVar.l(Drawable.class, Drawable.class, ay.a());
        vVar.k(Drawable.class, Drawable.class, new com.bumptech.glide.load.c.c.h());
        vVar.p(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.c.e.a(resources, 0));
        vVar.p(Bitmap.class, byte[].class, aVar);
        vVar.p(Drawable.class, byte[].class, new com.bumptech.glide.load.c.e.b(cVarH, aVar, fVar));
        vVar.p(com.bumptech.glide.load.c.d.e.class, byte[].class, fVar);
        com.bumptech.glide.load.u uVarD = bc.d(cVarH);
        vVar.k(ByteBuffer.class, Bitmap.class, uVarD);
        vVar.k(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.c.a.a(resources, uVarD));
        b(list);
        return vVar;
    }

    private static void b(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.bumptech.glide.c.c cVar = (com.bumptech.glide.c.c) it.next();
            try {
                cVar.b();
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(cVar.getClass().getName())), e2);
            }
        }
    }
}
