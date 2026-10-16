package com.android.car.libraries.apphost.external.model;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002*\u0001\u0007\b\u0007\u0018\u0000B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Ê\u0001\u0002\b\fÊ\u0001\u0002\b\r¨\u0006\u000b"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/LocalWrapperTemplate;", "Landroidx/car/app/model/Template;", "<init>", "()V", "wrapped", "(Landroidx/car/app/model/Template;)V", "holder", "com/android/car/libraries/apphost/external/model/LocalWrapperTemplate$holder$1", "Lcom/android/car/libraries/apphost/external/model/LocalWrapperTemplate$holder$1;", "getWrapped", "()Landroidx/car/app/model/Template;", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model", "Landroidx/car/app/annotations/KeepFields;", "Landroidx/car/app/annotations/CarProtocol;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@defpackage.rg
public final class LocalWrapperTemplate implements defpackage.wi {
    private final defpackage.gki holder;

    private LocalWrapperTemplate() {
        this.holder = new defpackage.gki();
    }

    public final defpackage.wi getWrapped() {
        defpackage.wi wiVar = this.holder.a;
        wiVar.getClass();
        return wiVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LocalWrapperTemplate(defpackage.wi wiVar) {
        this();
        wiVar.getClass();
        this.holder.a = wiVar;
    }
}
