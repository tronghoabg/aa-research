package com.android.car.libraries.apphost.external.model;

/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b\u001cÊ\u0001\u0002\b\u001dÊ\u0001\u0010\b\u001e\u0012\f\b\u001f\u0012\b\b\fJ\u0004\b\t0 ¨\u0006\u001b"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/ExtendedHeader;", "", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/ExtendedHeader$Builder;", "(Lcom/android/car/libraries/apphost/external/model/ExtendedHeader$Builder;)V", "value", "", "Landroidx/car/app/model/Action;", "endHeaderActions", "getEndHeaderActions", "()Ljava/util/List;", "startHeaderActions", "getStartHeaderActions", "Landroidx/car/app/model/CarText;", "title", "getTitle", "()Landroidx/car/app/model/CarText;", "toString", "", "hashCode", "", "equals", "", "other", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model", "Landroidx/car/app/annotations/KeepFields;", "Landroidx/car/app/annotations/CarProtocol;", "Landroidx/annotation/OptIn;", "markerClass", "Landroidx/car/app/annotations/ExperimentalCarApi;"}, k = 1, mv = {2, 4, 0}, xi = 48)
@defpackage.rg
public final class ExtendedHeader {
    private java.util.List<androidx.car.app.model.Action> endHeaderActions;
    private java.util.List<androidx.car.app.model.Action> startHeaderActions;
    private androidx.car.app.model.CarText title;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.car.app.model.Action>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<androidx.car.app.model.Action>] */
    private ExtendedHeader(defpackage.gka gkaVar) {
        this();
        this.endHeaderActions = gkaVar.a;
        this.startHeaderActions = gkaVar.b;
        this.title = (androidx.car.app.model.CarText) gkaVar.c;
    }

    public boolean equals(java.lang.Object other) {
        if (!(other instanceof com.android.car.libraries.apphost.external.model.ExtendedHeader)) {
            return false;
        }
        com.android.car.libraries.apphost.external.model.ExtendedHeader extendedHeader = (com.android.car.libraries.apphost.external.model.ExtendedHeader) other;
        return defpackage.afga.f(getEndHeaderActions(), extendedHeader.getEndHeaderActions()) && defpackage.afga.f(getStartHeaderActions(), extendedHeader.getStartHeaderActions()) && defpackage.afga.f(this.title, extendedHeader.title);
    }

    public final java.util.List<androidx.car.app.model.Action> getEndHeaderActions() {
        java.util.List<androidx.car.app.model.Action> list = this.endHeaderActions;
        if (list != null) {
            return list;
        }
        defpackage.afga.d("endHeaderActions");
        return null;
    }

    public final java.util.List<androidx.car.app.model.Action> getStartHeaderActions() {
        java.util.List<androidx.car.app.model.Action> list = this.startHeaderActions;
        if (list != null) {
            return list;
        }
        defpackage.afga.d("startHeaderActions");
        return null;
    }

    public final androidx.car.app.model.CarText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return j$.util.Objects.hash(this.title, getEndHeaderActions(), getStartHeaderActions());
    }

    public java.lang.String toString() {
        return "ExtendedHeader(title: " + this.title + ", [" + getStartHeaderActions().size() + " startHeaderActions], [" + getEndHeaderActions().size() + " endHeaderActions])";
    }

    private ExtendedHeader() {
    }

    public /* synthetic */ ExtendedHeader(defpackage.gka gkaVar, defpackage.affu affuVar) {
        this(gkaVar);
    }
}
