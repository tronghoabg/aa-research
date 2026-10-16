package com.android.car.libraries.apphost.external.model;

import androidx.car.app.model.Action;
import androidx.car.app.model.CarText;
import defpackage.afeu;
import defpackage.affa;
import defpackage.gjt;
import defpackage.rb;
import j$.util.Objects;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\n\u0010\u0013\u001a\u00020\u0014H\u0096\u0080\u0004J\n\u0010\u0015\u001a\u00020\u0016H\u0096\u0080\u0004J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u0096\u0082\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086$¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000fX\u0086\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, d2 = {"Lcom/android/car/libraries/apphost/external/model/ExtendedHeader;", "", "<init>", "()V", "builder", "Lcom/android/car/libraries/apphost/external/model/ExtendedHeader$Builder;", "(Lcom/android/car/libraries/apphost/external/model/ExtendedHeader$Builder;)V", "value", "", "Landroidx/car/app/model/Action;", "endHeaderActions", "getEndHeaderActions", "()Ljava/util/List;", "startHeaderActions", "getStartHeaderActions", "Landroidx/car/app/model/CarText;", "title", "getTitle", "()Landroidx/car/app/model/CarText;", "toString", "", "hashCode", "", "equals", "", "other", "Builder", "third_party.java_src.android_libs.car.apphost.main.com.android.car.libraries.apphost.external.model_model"}, k = 1, mv = {2, 3, 0}, xi = 48)
@rb
/* loaded from: classes2.dex */
public final class ExtendedHeader {
    private List<Action> endHeaderActions;
    private List<Action> startHeaderActions;
    private CarText title;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<androidx.car.app.model.Action>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List<androidx.car.app.model.Action>] */
    private ExtendedHeader(gjt gjtVar) {
        this();
        this.endHeaderActions = gjtVar.a;
        this.startHeaderActions = gjtVar.b;
        this.title = (CarText) gjtVar.c;
    }

    public boolean equals(Object other) {
        if (!(other instanceof ExtendedHeader)) {
            return false;
        }
        ExtendedHeader extendedHeader = (ExtendedHeader) other;
        return affa.f(getEndHeaderActions(), extendedHeader.getEndHeaderActions()) && affa.f(getStartHeaderActions(), extendedHeader.getStartHeaderActions()) && affa.f(this.title, extendedHeader.title);
    }

    public final List<Action> getEndHeaderActions() {
        List<Action> list = this.endHeaderActions;
        if (list != null) {
            return list;
        }
        affa.d("endHeaderActions");
        return null;
    }

    public final List<Action> getStartHeaderActions() {
        List<Action> list = this.startHeaderActions;
        if (list != null) {
            return list;
        }
        affa.d("startHeaderActions");
        return null;
    }

    public final CarText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return Objects.hash(this.title, getEndHeaderActions(), getStartHeaderActions());
    }

    public String toString() {
        return "ExtendedHeader(title: " + this.title + ", [" + getStartHeaderActions().size() + " startHeaderActions], [" + getEndHeaderActions().size() + " endHeaderActions])";
    }

    private ExtendedHeader() {
    }

    public /* synthetic */ ExtendedHeader(gjt gjtVar, afeu afeuVar) {
        this(gjtVar);
    }
}
