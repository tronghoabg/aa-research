package defpackage;

import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes2.dex */
public final class dum {
    public final String a;
    public final CharSequence b;
    public final CharSequence[] c;
    public final boolean d;
    public final int e;
    public final Bundle f;
    public final Set g;

    public dum(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z, int i, Bundle bundle, Set set) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequenceArr;
        this.d = z;
        this.e = i;
        this.f = bundle;
        this.g = set;
        if (i == 2 && !z) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static RemoteInput[] a(dum[] dumVarArr) {
        RemoteInput[] remoteInputArr = new RemoteInput[dumVarArr.length];
        for (int i = 0; i < dumVarArr.length; i++) {
            dum dumVar = dumVarArr[i];
            RemoteInput.Builder builderAddExtras = new RemoteInput.Builder(dumVar.a).setLabel(dumVar.b).setChoices(dumVar.c).setAllowFreeFormInput(dumVar.d).addExtras(dumVar.f);
            Set set = dumVar.g;
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    builderAddExtras.setAllowDataType((String) it.next(), true);
                }
            }
            if (Build.VERSION.SDK_INT >= 29) {
                builderAddExtras.setEditChoicesBeforeSending(dumVar.e);
            }
            remoteInputArr[i] = builderAddExtras.build();
        }
        return remoteInputArr;
    }
}
