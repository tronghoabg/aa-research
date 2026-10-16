package defpackage;

import android.os.UserHandle;
import android.os.UserManager;
import com.google.android.gms.car.senderprotocol.ChannelMessage;
import java.util.Comparator;
import java.util.Map;

/* loaded from: classes.dex */
public final /* synthetic */ class czs implements Comparator {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ czs(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v17, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [fvf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r4v43, types: [adnm, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v5, types: [afec, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [afeg, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                zf zfVar = czy.a;
                return ((Number) this.a.invoke(obj, obj2)).intValue();
            case 1:
                ?? r4 = this.a;
                return r4.invoke(obj).compareTo(r4.invoke(obj2));
            case 2:
                afeg afegVar = ded.a;
                return ((Number) this.a.invoke(obj, obj2)).intValue();
            case 3:
                int iCompare = this.a.compare(obj, obj2);
                return iCompare != 0 ? iCompare : Integer.valueOf(((ddu) obj).c).compareTo(Integer.valueOf(((ddu) obj2).c));
            case 4:
                return ((Number) this.a.invoke(obj, obj2)).intValue();
            case 5:
                String string = ((han) obj).b.toString();
                string.getClass();
                ?? r42 = this.a;
                String strB = r42.b(string);
                String string2 = ((han) obj2).b.toString();
                string2.getClass();
                return affa.x(strB, r42.b(string2));
            case 6:
                int i = mqi.f;
                return ((Number) this.a.invoke(obj, obj2)).intValue();
            case 7:
                UserManager userManager = (UserManager) this.a;
                return (int) (userManager.getSerialNumberForUser((UserHandle) obj) - userManager.getSerialNumberForUser((UserHandle) obj2));
            case 8:
                ChannelMessage channelMessage = (ChannelMessage) obj;
                ChannelMessage channelMessage2 = (ChannelMessage) obj2;
                channelMessage.getClass();
                channelMessage2.getClass();
                int i2 = channelMessage.b;
                Object obj3 = this.a;
                Integer numValueOf = Integer.valueOf(i2);
                Map map = ((rup) obj3).b;
                rvz rvzVar = (rvz) map.get(numValueOf);
                rvz rvzVar2 = (rvz) map.get(Integer.valueOf(channelMessage2.b));
                yde ydeVar = yde.b;
                rvzVar.getClass();
                rvzVar2.getClass();
                return ydeVar.c(rvzVar.f, rvzVar2.f).d(channelMessage.j, channelMessage2.j).a();
            case 9:
                Map.Entry entry = (Map.Entry) obj;
                Map.Entry entry2 = (Map.Entry) obj2;
                Comparator comparator = ygz.a;
                entry.getClass();
                entry2.getClass();
                return this.a.compare(entry.getKey(), entry2.getKey());
            case 10:
                ?? r43 = this.a;
                int iA = r43.a(obj) - r43.a(obj2);
                return iA != 0 ? iA : obj.getClass().getName().compareTo(obj2.getClass().getName());
            default:
                for (int i3 = 0; i3 < 2; i3++) {
                    afec afecVar = ((afec[]) this.a)[i3];
                    int iX = affa.x((Comparable) afecVar.invoke(obj), (Comparable) afecVar.invoke(obj2));
                    if (iX != 0) {
                        return iX;
                    }
                }
                return 0;
        }
    }

    public czs(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
