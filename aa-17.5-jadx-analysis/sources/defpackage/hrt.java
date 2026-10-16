package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class hrt implements ComponentCallbacks2 {
    private static volatile hrt f;
    private static volatile boolean g;
    public final hxe a;
    public final hsf b;
    public final List c = new ArrayList();
    public final hxl d;
    public final fxp e;
    private final idm h;
    private final hxw i;

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Map] */
    public hrt(Context context, hwj hwjVar, hxw hxwVar, hxe hxeVar, hxl hxlVar, idm idmVar, fxp fxpVar, Map map, List list, List list2, idu iduVar, htm htmVar) {
        this.a = hxeVar;
        this.d = hxlVar;
        this.i = hxwVar;
        this.h = idmVar;
        this.e = fxpVar;
        if (((hry) ((hsg) htmVar.a.get(hry.class))) != null) {
            throw null;
        }
        this.b = new hsf(context, hxlVar, new hso(this, list2, iduVar), new fxy(), map, list, hwjVar, htmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x021d A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x022c A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x023c A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0247 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027f A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0284 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010e A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0145 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x016f A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181 A[Catch: all -> 0x02bc, LOOP:2: B:72:0x017b->B:74:0x0181, LOOP_END, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018d A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01b0 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c9 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01e8 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f8 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0203 A[Catch: all -> 0x02bc, TryCatch #2 {all -> 0x02bc, blocks: (B:13:0x001f, B:15:0x002e, B:51:0x00f6, B:53:0x0100, B:54:0x0108, B:56:0x010e, B:58:0x011e, B:60:0x0126, B:61:0x0139, B:62:0x013d, B:64:0x0145, B:65:0x0149, B:67:0x014f, B:69:0x016f, B:71:0x0175, B:72:0x017b, B:74:0x0181, B:76:0x018d, B:77:0x0190, B:79:0x0194, B:80:0x01ac, B:82:0x01b0, B:83:0x01c4, B:91:0x01e4, B:93:0x01e8, B:94:0x01f4, B:96:0x01f8, B:97:0x01ff, B:99:0x0203, B:101:0x0209, B:102:0x0212, B:103:0x0219, B:105:0x021d, B:106:0x0228, B:108:0x022c, B:109:0x0238, B:111:0x023c, B:112:0x0243, B:114:0x0247, B:115:0x027b, B:117:0x027f, B:119:0x028a, B:118:0x0284, B:86:0x01c9, B:90:0x01d2, B:19:0x0038, B:21:0x0040, B:22:0x0047, B:23:0x004c, B:25:0x005c, B:28:0x0061, B:30:0x0069, B:31:0x0080, B:32:0x008a, B:34:0x0090, B:36:0x00a4, B:38:0x00b3, B:39:0x00bf, B:41:0x00c7, B:42:0x00d0, B:44:0x00d8, B:47:0x00e2, B:49:0x00eb), top: B:135:0x001f, outer: #0, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.hrt b(android.content.Context r24) {
        /*
            Method dump skipped, instructions count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hrt.b(android.content.Context):hrt");
    }

    public static hss c(Context context) {
        return h(context).b(context);
    }

    public static hss d(Fragment fragment) {
        return h(fragment.getContext()).c(fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static hss e(View view) {
        idm idmVarH = h(view.getContext());
        if (ify.h()) {
            return idmVarH.b(view.getContext().getApplicationContext());
        }
        a.al(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity activityA = idm.a(view.getContext());
        if (activityA == null) {
            return idmVarH.b(view.getContext().getApplicationContext());
        }
        if (!(activityA instanceof bc)) {
            return idmVarH.b(view.getContext().getApplicationContext());
        }
        bc bcVar = (bc) activityA;
        yw ywVar = idmVarH.a;
        ywVar.clear();
        idm.e(bcVar.a().l(), ywVar);
        View viewFindViewById = bcVar.findViewById(R.id.content);
        Fragment fragment = null;
        while (!view.equals(viewFindViewById) && (fragment = (Fragment) ywVar.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        ywVar.clear();
        return fragment != null ? idmVarH.c(fragment) : idmVarH.d(bcVar);
    }

    private static GeneratedAppGlideModule g(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            i(e);
            return null;
        } catch (InstantiationException e2) {
            i(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            i(e3);
            return null;
        } catch (InvocationTargetException e4) {
            i(e4);
            return null;
        }
    }

    private static idm h(Context context) {
        a.al(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).h;
    }

    private static void i(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.b.getBaseContext();
    }

    public final void f() {
        ify.f();
        this.i.i(0L);
        this.a.c();
        this.d.b();
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        f();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        ify.f();
        List<hss> list = this.c;
        synchronized (list) {
            for (hss hssVar : list) {
            }
        }
        hxw hxwVar = this.i;
        if (i >= 40) {
            hxwVar.i(0L);
        } else if (i >= 20 || i == 15) {
            hxwVar.i(hxwVar.e() / 2);
        }
        this.a.e(i);
        this.d.d(i);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
