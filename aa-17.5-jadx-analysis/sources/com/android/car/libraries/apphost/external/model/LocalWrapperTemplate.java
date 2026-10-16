package com.android.car.libraries.apphost.external.model;

import defpackage.gkb;
import defpackage.rb;
import defpackage.wb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005*\u0001\u0007\b\u0007\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/LocalWrapperTemplate;", "Landroidx/car/app/model/Template;", "<init>", "()V", "wrapped", "(Landroidx/car/app/model/Template;)V", "holder", "com/android/car/libraries/apphost/external/model/LocalWrapperTemplate$holder$1", "Lcom/android/car/libraries/apphost/external/model/LocalWrapperTemplate$holder$1;", "getWrapped", "()Landroidx/car/app/model/Template;", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class LocalWrapperTemplate implements wb {
    private final gkb holder;

    private LocalWrapperTemplate() {
        this.holder = new gkb();
    }

    public final wb getWrapped() {
        wb wbVar = this.holder.a;
        wbVar.getClass();
        return wbVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalWrapperTemplate(wb wbVar) {
        this();
        wbVar.getClass();
        this.holder.a = wbVar;
    }
}
