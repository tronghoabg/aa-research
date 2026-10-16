package com.bumptech.glide;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.google.android.apps.auto.components.app.glide.GearheadAppGlideModule;
import defpackage.hrr;
import defpackage.hrt;
import defpackage.hse;
import defpackage.hsn;
import defpackage.hzc;
import java.io.InputStream;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public final class GeneratedAppGlideModuleImpl extends GeneratedAppGlideModule {
    private final GearheadAppGlideModule appGlideModule = new GearheadAppGlideModule();

    public GeneratedAppGlideModuleImpl(Context context) {
        if (Log.isLoggable("Glide", 3)) {
            Log.d("Glide", "Discovered AppGlideModule from annotation: com.google.android.apps.auto.components.app.glide.GearheadAppGlideModule");
            Log.d("Glide", "Discovered LibraryGlideModule from annotation: com.android.car.libraries.apphost.lettertile.glide.LetterTileGlideModule");
        }
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public Set<Class<?>> getExcludedModuleClasses() {
        return Collections.EMPTY_SET;
    }

    @Override // com.bumptech.glide.GeneratedAppGlideModule
    public hrr getRequestManagerFactory() {
        return new hrr(0);
    }

    @Override // defpackage.idu
    public boolean isManifestParsingEnabled() {
        return true;
    }

    @Override // defpackage.idx, defpackage.idz
    public void registerComponents(Context context, hrt hrtVar, hsn hsnVar) {
        hsnVar.h(Uri.class, InputStream.class, new hzc(context, 1));
        this.appGlideModule.registerComponents(context, hrtVar, hsnVar);
    }

    @Override // defpackage.idu, defpackage.idv
    public void applyOptions(Context context, hse hseVar) {
    }
}
