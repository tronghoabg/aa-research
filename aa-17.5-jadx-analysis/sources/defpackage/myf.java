package defpackage;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes2.dex */
final /* synthetic */ class myf extends afey implements afeg {
    public static final myf a = new myf();

    public myf() {
        super(2, mon.class, "<init>", "<init>(Landroid/content/Context;Landroid/content/ComponentName;)V", 0);
    }

    @Override // defpackage.afeg
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        Context context = (Context) obj;
        ComponentName componentName = (ComponentName) obj2;
        context.getClass();
        componentName.getClass();
        return new mon(context, componentName);
    }
}
