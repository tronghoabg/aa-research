package com.waze.destination_cell.b;

import android.graphics.Bitmap;
import com.waze.ak.m;
import com.waze.car_lib.r.aw;
import com.waze.favorites.FavoritesActivity;
import com.waze.jni.protos.InsightPriority;
import com.waze.jni.protos.NativeBitmap;
import com.waze.navigate.HistoryActivity;
import com.waze.z.a.g.s;
import h.g.b.x;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class e {
    public /* synthetic */ e(byte[] bArr) {
    }

    public static g a(com.waze.destination_cell.view.c cVar, com.waze.bt.e eVar, HistoryActivity historyActivity) {
        return new g(cVar, eVar, historyActivity);
    }

    public static i b(com.waze.destination_cell.view.c cVar, com.waze.bt.e eVar, FavoritesActivity favoritesActivity) {
        return new i(cVar, eVar, favoritesActivity);
    }

    public static void c(s sVar) {
        x.f(sVar, "<this>");
    }

    public static com.waze.an.a.x d(InsightPriority insightPriority) {
        x.f(insightPriority, "<this>");
        return new com.waze.an.a.x(insightPriority.getValue(), insightPriority.getPreemptive());
    }

    public static /* synthetic */ aw e(m mVar) {
        x.f(mVar, "builder");
        return new aw(mVar);
    }

    public static /* synthetic */ NativeBitmap g(Bitmap bitmap) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getByteCount());
        x.e(byteBufferAllocate, "allocate(...)");
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        NativeBitmap.Builder builderNewBuilder = NativeBitmap.newBuilder();
        byte[] bArrArray = byteBufferAllocate.array();
        x.e(bArrArray, "array(...)");
        builderNewBuilder.setBitmapBytes(com.waze.sharedui.e.e.b(bArrArray));
        builderNewBuilder.setWidth(bitmap.getWidth());
        builderNewBuilder.setHeight(bitmap.getHeight());
        NativeBitmap nativeBitmapBuild = builderNewBuilder.build();
        x.e(nativeBitmapBuild, "build(...)");
        return nativeBitmapBuild;
    }

    private e() {
        throw null;
    }
}
