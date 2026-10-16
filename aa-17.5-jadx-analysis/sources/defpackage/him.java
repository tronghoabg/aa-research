package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Metadata;

/* loaded from: classes2.dex */
public final class him {
    public final Object a;
    public final int b;
    public final Metadata c;
    public final CarText d;
    public final int e;
    public final int f;
    public final ghy g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final ConversationItem k;
    public final hin l;
    public boolean m;

    public him(hil hilVar) {
        this.a = hilVar.a;
        this.b = hilVar.b;
        Metadata metadata = hilVar.c;
        metadata.getClass();
        this.c = metadata;
        this.d = hilVar.h;
        this.e = hilVar.e;
        this.f = hilVar.d;
        this.l = hilVar.f;
        this.m = hilVar.g;
        ghy ghyVar = hilVar.i;
        ghyVar.getClass();
        this.g = ghyVar;
        this.h = hilVar.j;
        this.k = hilVar.m;
        this.i = hilVar.k;
        this.j = hilVar.l;
    }

    public final boolean a() {
        return (this.e & 4) != 0;
    }

    public final String toString() {
        return "[" + this.a + ", group: " + this.l + "]";
    }
}
