package com.bytedance.sdk.component.adexpress.uef.oa;

import N0.a;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.component.adexpress.uef.yo.uef;
import com.bytedance.sdk.component.utils.ku;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class yo {
    public List<uef.C0057uef> oa(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar, com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<uef.C0057uef> arrayList3 = new ArrayList<>();
        if (uefVar2 == null || uefVar2.ivm().isEmpty()) {
            arrayList2.addAll(uefVar.ivm());
        } else if (uefVar.ivm().isEmpty()) {
            arrayList.addAll(uefVar2.ivm());
        } else {
            for (uef.C0057uef c0057uef : uefVar.ivm()) {
                if (!uefVar2.ivm().contains(c0057uef) && c0057uef != null && c0057uef.uef() != null && c0057uef.oa() != null) {
                    arrayList2.add(c0057uef);
                }
            }
            for (uef.C0057uef c0057uef2 : uefVar2.ivm()) {
                if (!uefVar.ivm().contains(c0057uef2)) {
                    arrayList.add(c0057uef2);
                }
            }
        }
        if (uef(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public abstract File uef();

    public boolean uef(Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> map) {
        if (map == null || map.size() == 0) {
            return false;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar = map.get(it.next());
            if (uefVar != null && !uef(uefVar.ivm())) {
                return false;
            }
        }
        return true;
    }

    public void yo(List<uef.C0057uef> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<uef.C0057uef> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(uef(), com.bytedance.sdk.component.utils.lw.uef(it.next().uef()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public boolean uef(List<uef.C0057uef> list) throws IOException {
        if (list == null || list.size() <= 0 || uef() == null) {
            return false;
        }
        for (uef.C0057uef c0057uef : list) {
            String strUef = com.bytedance.sdk.component.utils.lw.uef(c0057uef.uef());
            if (TextUtils.isEmpty(strUef)) {
                return false;
            }
            File file = new File(uef(), strUef);
            String strUef2 = com.bytedance.sdk.component.utils.lw.uef(file);
            if (!file.exists() || !file.isFile() || c0057uef.oa() == null || !c0057uef.oa().equals(strUef2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean yo(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar, com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar2) {
        if (uefVar != null) {
            try {
                if (!TextUtils.isEmpty(uefVar.yo())) {
                    if (uefVar2 == null) {
                        return false;
                    }
                    String strXs = uefVar.xs();
                    String strXs2 = uefVar2.xs();
                    if ((!TextUtils.isEmpty(strXs2) && !strXs2.equals(strXs)) || uef(uefVar.yo(), uefVar2.yo())) {
                        return true;
                    }
                    Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef = uefVar.uef();
                    Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef2 = uefVar2.uef();
                    if (mapUef.isEmpty()) {
                        return !mapUef2.isEmpty();
                    }
                    if (mapUef2.isEmpty()) {
                        return false;
                    }
                    return uef(mapUef, mapUef2);
                }
            } catch (Throwable th) {
                th.getMessage();
                return false;
            }
        }
        return true;
    }

    public boolean uef(uef.oa oaVar) {
        if (oaVar == null || uef() == null) {
            return false;
        }
        List<Pair<String, String>> listOa = oaVar.oa();
        if (listOa == null || listOa.size() <= 0) {
            return true;
        }
        Iterator<Pair<String, String>> it = listOa.iterator();
        while (it.hasNext()) {
            File file = new File(uef(), (String) it.next().first);
            if (!file.exists() || !file.isFile()) {
                return false;
            }
        }
        return true;
    }

    public void oa(List<uef.C0057uef> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<uef.C0057uef> it = list.iterator();
        while (it.hasNext()) {
            File file = new File(uef(), com.bytedance.sdk.component.utils.lw.uef(it.next().uef()));
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    public List<uef.C0057uef> uef(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar, com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar2) {
        Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef = uefVar.uef();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<uef.C0057uef> arrayList3 = new ArrayList<>();
        if (mapUef.size() == 0) {
            if (uefVar2 != null && uefVar2.uef().size() != 0) {
                Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef2 = uefVar2.uef();
                Iterator<String> it = mapUef2.keySet().iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar3 = mapUef2.get(it.next());
                    if (uefVar3 != null) {
                        arrayList.addAll(uefVar3.ivm());
                    }
                }
            }
        } else if (uefVar2 != null && uefVar2.uef().size() != 0) {
            Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> mapUef3 = uefVar2.uef();
            for (String str : mapUef.keySet()) {
                com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar4 = mapUef.get(str);
                com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar5 = mapUef3.get(str);
                if (uefVar5 == null && uefVar4 != null) {
                    arrayList2.addAll(uefVar4.ivm());
                } else if (uefVar4 == null && uefVar5 != null) {
                    arrayList.addAll(uefVar5.ivm());
                } else if (uefVar4 != null) {
                    for (uef.C0057uef c0057uef : uefVar4.ivm()) {
                        if (c0057uef != null && !uefVar5.ivm().contains(c0057uef) && c0057uef.oa() != null && c0057uef.uef() != null) {
                            arrayList2.add(c0057uef);
                        }
                    }
                    for (uef.C0057uef c0057uef2 : uefVar5.ivm()) {
                        if (c0057uef2 != null && !uefVar4.ivm().contains(c0057uef2)) {
                            arrayList.add(c0057uef2);
                        }
                    }
                }
            }
        } else if (mapUef.size() != 0) {
            Iterator<String> it2 = mapUef.keySet().iterator();
            while (it2.hasNext()) {
                com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar6 = mapUef.get(it2.next());
                if (uefVar6 != null) {
                    arrayList2.addAll(uefVar6.ivm());
                }
            }
        }
        if (uef(arrayList2, arrayList3)) {
            return arrayList;
        }
        return null;
    }

    public static void oa(File file, com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar, String str) {
        if (uefVar == null || file == null) {
            return;
        }
        try {
            new File(file, str).delete();
        } catch (Throwable unused) {
        }
        if (uefVar.ivm() != null) {
            Iterator<uef.C0057uef> it = uefVar.ivm().iterator();
            while (it.hasNext()) {
                try {
                    new File(file, com.bytedance.sdk.component.utils.lw.uef(it.next().uef())).delete();
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private boolean uef(List<uef.C0057uef> list, List<uef.C0057uef> list2) {
        for (uef.C0057uef c0057uef : list) {
            String strUef = c0057uef.uef();
            String strUef2 = com.bytedance.sdk.component.utils.lw.uef(strUef);
            File file = new File(uef(), strUef2);
            File file2 = new File(file + ".tmp");
            if (file.exists()) {
                try {
                    file.delete();
                } catch (Throwable unused) {
                }
            }
            if (file2.exists()) {
                try {
                    file2.delete();
                } catch (Throwable unused2) {
                }
            }
            com.bytedance.sdk.component.xs.oa.uef uefVarIvm = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().ivm();
            uefVarIvm.yo(strUef);
            uefVarIvm.uef(uef().getAbsolutePath(), strUef2);
            com.bytedance.sdk.component.xs.oa oaVarLw = uefVarIvm.lw();
            list2.add(c0057uef);
            if (oaVarLw == null || !oaVarLw.ivm() || oaVarLw.lw() == null || !oaVarLw.lw().exists()) {
                yo(list2);
                return false;
            }
        }
        return true;
    }

    public boolean uef(String str) {
        File file = new File(uef().getAbsoluteFile(), a.f(com.bytedance.sdk.component.utils.lw.uef(str), ".zip"));
        com.bytedance.sdk.component.xs.oa.uef uefVarIvm = com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().yo().ivm();
        uefVarIvm.yo(str);
        uefVarIvm.uef(file.getParent(), file.getName());
        com.bytedance.sdk.component.xs.oa oaVarLw = uefVarIvm.lw();
        if (oaVarLw.ivm() && oaVarLw.lw() != null && oaVarLw.lw().exists()) {
            File fileLw = oaVarLw.lw();
            try {
                ku.uef(fileLw.getAbsolutePath(), file.getParent());
                if (!fileLw.exists()) {
                    return true;
                }
                fileLw.delete();
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public void uef(int i5) {
        if (com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().moa() != null) {
            com.bytedance.sdk.component.adexpress.uef.uef.uef.uef().moa().uef(i5);
        }
    }

    public static void uef(File file, com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar, String str) throws IOException {
        FileOutputStream fileOutputStream;
        if (uefVar == null) {
            return;
        }
        String strZjm = uefVar.zjm();
        if (TextUtils.isEmpty(strZjm)) {
            return;
        }
        File file2 = new File(file, str);
        File file3 = new File(file2 + ".tmp");
        if (file3.exists()) {
            file3.delete();
        }
        try {
            try {
                fileOutputStream = new FileOutputStream(file3);
            } catch (Throwable unused) {
                fileOutputStream = null;
            }
            try {
                fileOutputStream.write(strZjm.getBytes("utf-8"));
                if (file2.exists()) {
                    file2.delete();
                }
                file3.renameTo(file2);
                fileOutputStream.close();
            } catch (Throwable unused2) {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            }
        } catch (IOException unused3) {
        }
    }

    private static boolean uef(Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> map, Map<String, com.bytedance.sdk.component.adexpress.uef.yo.uef> map2) {
        if (map.size() != map2.size()) {
            return true;
        }
        for (String str : map2.keySet()) {
            com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar = map.get(str);
            if (uefVar == null) {
                return true;
            }
            com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar2 = map2.get(str);
            if (uefVar2 == null) {
                return false;
            }
            if (uef(uefVar.yo(), uefVar2.yo())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean uef(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r7 = r7.split(r0)
            java.lang.String[] r6 = r6.split(r0)
            int r0 = r7.length
            int r1 = r6.length
            int r0 = java.lang.Math.min(r0, r1)
            r1 = 0
            r2 = r1
        L12:
            if (r2 >= r0) goto L42
            r3 = r7[r2]
            int r3 = r3.length()
            r4 = r6[r2]
            int r4 = r4.length()
            int r3 = r3 - r4
            r4 = 1
            if (r3 != 0) goto L3f
            r3 = r7[r2]
            r5 = r6[r2]
            int r3 = r3.compareTo(r5)
            if (r3 <= 0) goto L2f
            return r4
        L2f:
            if (r3 >= 0) goto L32
            return r1
        L32:
            int r3 = r0 + (-1)
            if (r2 != r3) goto L3c
            int r7 = r7.length
            int r6 = r6.length
            if (r7 <= r6) goto L3b
            return r4
        L3b:
            return r1
        L3c:
            int r2 = r2 + 1
            goto L12
        L3f:
            if (r3 <= 0) goto L42
            return r4
        L42:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.uef.oa.yo.uef(java.lang.String, java.lang.String):boolean");
    }

    public static boolean uef(com.bytedance.sdk.component.adexpress.uef.yo.uef uefVar, String str) {
        if (uefVar == null) {
            return true;
        }
        try {
            if (TextUtils.isEmpty(uefVar.yo())) {
                return true;
            }
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return uef(uefVar.yo(), str);
        } catch (Throwable unused) {
            return false;
        }
    }
}
