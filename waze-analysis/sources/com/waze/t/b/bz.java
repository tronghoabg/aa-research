package com.waze.t.b;

import kotlinx.coroutines.b.ch;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public class bz {
    public /* synthetic */ bz(byte[] bArr) {
    }

    private static com.waze.copilot.data.x a(com.waze.copilot.aj ajVar) {
        int iOrdinal = ajVar.ordinal();
        if (iOrdinal == 0) {
            return com.waze.copilot.data.x.f23078c;
        }
        if (iOrdinal == 1) {
            return com.waze.copilot.data.x.f23076a;
        }
        if (iOrdinal == 2) {
            return com.waze.copilot.data.x.f23077b;
        }
        if (iOrdinal == 3) {
            return com.waze.copilot.data.x.f23079d;
        }
        if (iOrdinal == 4) {
            return com.waze.copilot.data.x.f23080e;
        }
        throw new h.i();
    }

    public static kotlinx.coroutines.b.k d(ch chVar) {
        h.g.b.x.f(chVar, "<this>");
        return new aw(kotlinx.coroutines.b.ai.Q(chVar, new by(null, 1, null)), 3);
    }

    public static kotlinx.coroutines.b.k e(ch chVar) {
        h.g.b.x.f(chVar, "<this>");
        return kotlinx.coroutines.b.ai.Q(chVar, new by(null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.waze.copilot.data.a.g f(com.waze.copilot.w r18) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.waze.t.b.bz.f(com.waze.copilot.w):com.waze.copilot.data.a.g");
    }

    public static com.waze.copilot.data.a g(com.waze.copilot.b bVar) {
        h.g.b.x.f(bVar, "<this>");
        long lastChangedTimestampSec = bVar.getLastChangedTimestampSec();
        String assetsZipFileUrl = bVar.getAssetsZipFileUrl();
        h.g.b.x.e(assetsZipFileUrl, "getAssetsZipFileUrl(...)");
        return new com.waze.copilot.data.a(lastChangedTimestampSec, assetsZipFileUrl);
    }

    public static com.waze.copilot.data.b h(com.waze.copilot.d dVar) {
        h.g.b.x.f(dVar, "<this>");
        return new com.waze.copilot.data.b(dVar.getPreviewImageUrl());
    }

    public static com.waze.copilot.data.c i(com.waze.copilot.j jVar) {
        h.g.b.x.f(jVar, "<this>");
        long carId = jVar.getCarId();
        String carName = jVar.getCarName();
        h.g.b.x.e(carName, "getCarName(...)");
        com.waze.copilot.data.ad adVar = null;
        adVar = null;
        com.waze.copilot.data.ae aeVar = null;
        if (jVar.hasCar3DInfo() && (jVar.getCar3DInfo().getHasShareTexture() || jVar.getCar3DInfo().getHasTaxiTexture() || jVar.getCar3DInfo().getHasNormalTexture())) {
            com.waze.copilot.f car3DInfo = jVar.getCar3DInfo();
            h.g.b.x.e(car3DInfo, "getCar3DInfo(...)");
            boolean hasNormalTexture = car3DInfo.getHasNormalTexture();
            boolean hasTaxiTexture = car3DInfo.getHasTaxiTexture();
            boolean hasShareTexture = car3DInfo.getHasShareTexture();
            float scale = car3DInfo.getScale();
            if (car3DInfo.hasLighting()) {
                com.waze.copilot.h lighting = car3DInfo.getLighting();
                h.g.b.x.e(lighting, "getLighting(...)");
                aeVar = new com.waze.copilot.data.ae(lighting.getAmbientIntensity(), Float.valueOf(lighting.getDiffuseIntensity()));
            }
            adVar = new com.waze.copilot.data.ad(hasNormalTexture, hasTaxiTexture, hasShareTexture, scale, aeVar);
        }
        com.waze.copilot.b downloadable = jVar.getDownloadable();
        h.g.b.x.e(downloadable, "getDownloadable(...)");
        com.waze.copilot.data.a aVarG = g(downloadable);
        com.waze.copilot.d preview = jVar.getPreview();
        h.g.b.x.e(preview, "getPreview(...)");
        return new com.waze.copilot.data.c(carId, carName, adVar, aVarG, h(preview));
    }

    public static com.waze.copilot.data.ah j(com.waze.copilot.aq aqVar) {
        h.g.b.x.f(aqVar, "<this>");
        int iOrdinal = aqVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return com.waze.copilot.data.ah.f22965a;
        }
        if (iOrdinal == 2) {
            return com.waze.copilot.data.ah.f22966b;
        }
        throw new h.i();
    }

    public static boolean k(com.waze.copilot.b bVar) {
        h.g.b.x.f(bVar, "<this>");
        return bVar.hasLastChangedTimestampSec() && bVar.hasAssetsZipFileUrl();
    }

    public static boolean l(com.waze.copilot.d dVar) {
        h.g.b.x.f(dVar, "<this>");
        return dVar.hasPreviewImageUrl();
    }

    public static boolean m(com.waze.copilot.j jVar) {
        h.g.b.x.f(jVar, "<this>");
        if (jVar.hasCarId() && jVar.hasCarName() && jVar.hasDownloadable() && jVar.hasPreview()) {
            com.waze.copilot.b downloadable = jVar.getDownloadable();
            h.g.b.x.e(downloadable, "getDownloadable(...)");
            if (k(downloadable)) {
                com.waze.copilot.d preview = jVar.getPreview();
                h.g.b.x.e(preview, "getPreview(...)");
                if (l(preview)) {
                    if (!jVar.hasCar3DInfo()) {
                        return true;
                    }
                    if (jVar.hasCar3DInfo()) {
                        com.waze.copilot.f car3DInfo = jVar.getCar3DInfo();
                        h.g.b.x.e(car3DInfo, "getCar3DInfo(...)");
                        if (car3DInfo.hasHasNormalTexture() && car3DInfo.hasHasTaxiTexture() && car3DInfo.hasHasShareTexture() && car3DInfo.hasScale() && car3DInfo.hasLighting()) {
                            com.waze.copilot.h lighting = car3DInfo.getLighting();
                            h.g.b.x.e(lighting, "getLighting(...)");
                            return lighting.hasAmbientIntensity() && lighting.hasDiffuseIntensity();
                        }
                    }
                }
            }
        }
        return false;
    }

    private bz() {
        throw null;
    }
}
