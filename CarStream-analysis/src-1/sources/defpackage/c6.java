package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class c6 implements Comparator {
    public final /* synthetic */ int a;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return ((String) obj).compareToIgnoreCase((String) obj2);
            default:
                return Integer.compare(w7.h((u7) obj), w7.h((u7) obj2));
        }
    }
}
