package defpackage;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class xdy {
    public static final yph a = yph.c("GH.RotaryKeyboard");
    public final ArrayList b = new ArrayList();
    public xdx c;
    public xdw d;
    private lgp e;
    private XmlResourceParser f;
    private Resources g;

    /* JADX WARN: Removed duplicated region for block: B:118:0x0263 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x026c A[Catch: Exception -> 0x02c9, TryCatch #1 {Exception -> 0x02c9, blocks: (B:11:0x0058, B:12:0x0069, B:14:0x006f, B:16:0x0079, B:40:0x00e7, B:17:0x0082, B:19:0x0088, B:21:0x0092, B:23:0x009d, B:25:0x00a9, B:26:0x00ae, B:28:0x00b6, B:29:0x00c0, B:31:0x00c6, B:33:0x00cd, B:34:0x00d1, B:36:0x00d7, B:37:0x00dd, B:39:0x00e4, B:43:0x00f3, B:45:0x00f9, B:51:0x011f, B:61:0x0130, B:62:0x0138, B:63:0x0140, B:64:0x0148, B:65:0x0150, B:66:0x0158, B:68:0x0160, B:70:0x0169, B:71:0x016b, B:46:0x0110, B:72:0x0177, B:74:0x0181, B:75:0x0194, B:77:0x019a, B:79:0x01a4, B:103:0x0228, B:80:0x01b0, B:82:0x01b6, B:84:0x01c0, B:86:0x01cd, B:88:0x01df, B:89:0x01e6, B:91:0x01f2, B:92:0x01fc, B:94:0x0202, B:96:0x0209, B:97:0x020e, B:99:0x0214, B:100:0x021b, B:102:0x0222, B:105:0x0232, B:107:0x0238, B:121:0x0269, B:123:0x026c, B:125:0x0282, B:127:0x0286, B:130:0x028c, B:132:0x0296, B:133:0x02a2, B:135:0x02a8, B:136:0x02b9, B:138:0x02bf, B:108:0x024d), top: B:163:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f A[Catch: Exception -> 0x02c9, TryCatch #1 {Exception -> 0x02c9, blocks: (B:11:0x0058, B:12:0x0069, B:14:0x006f, B:16:0x0079, B:40:0x00e7, B:17:0x0082, B:19:0x0088, B:21:0x0092, B:23:0x009d, B:25:0x00a9, B:26:0x00ae, B:28:0x00b6, B:29:0x00c0, B:31:0x00c6, B:33:0x00cd, B:34:0x00d1, B:36:0x00d7, B:37:0x00dd, B:39:0x00e4, B:43:0x00f3, B:45:0x00f9, B:51:0x011f, B:61:0x0130, B:62:0x0138, B:63:0x0140, B:64:0x0148, B:65:0x0150, B:66:0x0158, B:68:0x0160, B:70:0x0169, B:71:0x016b, B:46:0x0110, B:72:0x0177, B:74:0x0181, B:75:0x0194, B:77:0x019a, B:79:0x01a4, B:103:0x0228, B:80:0x01b0, B:82:0x01b6, B:84:0x01c0, B:86:0x01cd, B:88:0x01df, B:89:0x01e6, B:91:0x01f2, B:92:0x01fc, B:94:0x0202, B:96:0x0209, B:97:0x020e, B:99:0x0214, B:100:0x021b, B:102:0x0222, B:105:0x0232, B:107:0x0238, B:121:0x0269, B:123:0x026c, B:125:0x0282, B:127:0x0286, B:130:0x028c, B:132:0x0296, B:133:0x02a2, B:135:0x02a8, B:136:0x02b9, B:138:0x02bf, B:108:0x024d), top: B:163:0x0058 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0169 A[Catch: Exception -> 0x02c9, TryCatch #1 {Exception -> 0x02c9, blocks: (B:11:0x0058, B:12:0x0069, B:14:0x006f, B:16:0x0079, B:40:0x00e7, B:17:0x0082, B:19:0x0088, B:21:0x0092, B:23:0x009d, B:25:0x00a9, B:26:0x00ae, B:28:0x00b6, B:29:0x00c0, B:31:0x00c6, B:33:0x00cd, B:34:0x00d1, B:36:0x00d7, B:37:0x00dd, B:39:0x00e4, B:43:0x00f3, B:45:0x00f9, B:51:0x011f, B:61:0x0130, B:62:0x0138, B:63:0x0140, B:64:0x0148, B:65:0x0150, B:66:0x0158, B:68:0x0160, B:70:0x0169, B:71:0x016b, B:46:0x0110, B:72:0x0177, B:74:0x0181, B:75:0x0194, B:77:0x019a, B:79:0x01a4, B:103:0x0228, B:80:0x01b0, B:82:0x01b6, B:84:0x01c0, B:86:0x01cd, B:88:0x01df, B:89:0x01e6, B:91:0x01f2, B:92:0x01fc, B:94:0x0202, B:96:0x0209, B:97:0x020e, B:99:0x0214, B:100:0x021b, B:102:0x0222, B:105:0x0232, B:107:0x0238, B:121:0x0269, B:123:0x026c, B:125:0x0282, B:127:0x0286, B:130:0x028c, B:132:0x0296, B:133:0x02a2, B:135:0x02a8, B:136:0x02b9, B:138:0x02bf, B:108:0x024d), top: B:163:0x0058 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xdy(android.content.Context r29, int r30, boolean r31, android.view.inputmethod.EditorInfo r32) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 844
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xdy.<init>(android.content.Context, int, boolean, android.view.inputmethod.EditorInfo):void");
    }
}
