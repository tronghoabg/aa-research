package defpackage;

import com.carstream.tech.launcher.AppRepo;
import java.util.Comparator;
import java.util.Map;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final /* synthetic */ class a1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Map b;

    public /* synthetic */ a1(Map map, int i) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AppRepo.Entry entry = (AppRepo.Entry) obj;
        AppRepo.Entry entry2 = (AppRepo.Entry) obj2;
        switch (this.a) {
            case 0:
                return AppRepo.lambda$topGanDay$6(this.b, entry, entry2);
            default:
                return AppRepo.lambda$topHayDung$7(this.b, entry, entry2);
        }
    }
}
