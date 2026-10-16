package com.bykv.vk.openvk.uef.uef.oa.uef.uef;

import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public class uef implements com.bykv.vk.openvk.uef.uef.uef.uef.oa {
    private String uef = "video_reward_full";

    /* renamed from: oa, reason: collision with root package name */
    private String f24499oa = "video_brand";
    private String yo = "video_splash";
    private String moa = "video_default";
    private String lw = null;
    private String ivm = null;
    private String xs = null;
    private String bcc = null;
    private String cz = null;

    private List<com.bykv.vk.openvk.uef.uef.uef.uef.uef> ivm() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new com.bykv.vk.openvk.uef.uef.uef.uef.uef(new File(uef()).listFiles(), com.bykv.vk.openvk.uef.uef.oa.uef.yo()));
        arrayList.add(new com.bykv.vk.openvk.uef.uef.uef.uef.uef(new File(oa()).listFiles(), com.bykv.vk.openvk.uef.uef.oa.uef.oa()));
        arrayList.add(new com.bykv.vk.openvk.uef.uef.uef.uef.uef(new File(lw()).listFiles(), com.bykv.vk.openvk.uef.uef.oa.uef.moa()));
        arrayList.add(new com.bykv.vk.openvk.uef.uef.uef.uef.uef(new File(yo()).listFiles(), com.bykv.vk.openvk.uef.uef.oa.uef.lw()));
        return arrayList;
    }

    private Set<String> xs() {
        HashSet hashSet = new HashSet();
        for (com.bykv.vk.openvk.uef.uef.oa.uef.uef uefVar : com.bykv.vk.openvk.uef.uef.oa.uef.uef.uef.values()) {
            if (uefVar != null && uefVar.uef() != null) {
                com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVarUef = uefVar.uef();
                hashSet.add(com.bykv.vk.openvk.uef.uef.oa.moa.oa.oa(yoVarUef.lw(), yoVarUef.bs()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.uef.uef.oa.moa.oa.yo(yoVarUef.lw(), yoVarUef.bs()).getAbsolutePath());
            }
        }
        for (com.bykv.vk.openvk.uef.uef.oa.uef.oa.oa oaVar : com.bykv.vk.openvk.uef.uef.oa.uef.oa.yo.uef.values()) {
            if (oaVar != null && oaVar.uef() != null) {
                com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVarUef2 = oaVar.uef();
                hashSet.add(com.bykv.vk.openvk.uef.uef.oa.moa.oa.oa(yoVarUef2.lw(), yoVarUef2.bs()).getAbsolutePath());
                hashSet.add(com.bykv.vk.openvk.uef.uef.oa.moa.oa.yo(yoVarUef2.lw(), yoVarUef2.bs()).getAbsolutePath());
            }
        }
        return hashSet;
    }

    public String lw() {
        if (this.xs == null) {
            this.xs = this.lw + File.separator + this.f24499oa;
            File file = new File(this.xs);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.xs;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public synchronized void moa() {
        try {
            Set<String> setXs = null;
            for (com.bykv.vk.openvk.uef.uef.uef.uef.uef uefVar : ivm()) {
                File[] fileArrUef = uefVar.uef();
                if (fileArrUef != null && fileArrUef.length >= uefVar.oa()) {
                    if (setXs == null) {
                        setXs = xs();
                    }
                    int iOa = uefVar.oa() - 2;
                    if (iOa < 0) {
                        iOa = 0;
                    }
                    uef(uefVar.uef(), iOa, setXs);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public String oa() {
        if (this.bcc == null) {
            this.bcc = this.lw + File.separator + this.yo;
            File file = new File(this.bcc);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.bcc;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public void uef(String str) {
        this.lw = str;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public String yo() {
        if (this.cz == null) {
            this.cz = this.lw + File.separator + this.moa;
            File file = new File(this.cz);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.cz;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public String uef() {
        if (this.ivm == null) {
            this.ivm = this.lw + File.separator + this.uef;
            File file = new File(this.ivm);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return this.ivm;
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public long oa(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        if (TextUtils.isEmpty(yoVar.lw()) || TextUtils.isEmpty(yoVar.bs())) {
            return 0L;
        }
        return com.bykv.vk.openvk.uef.uef.oa.moa.oa.uef(yoVar.lw(), yoVar.bs());
    }

    @Override // com.bykv.vk.openvk.uef.uef.uef.uef.oa
    public boolean uef(com.bykv.vk.openvk.uef.uef.uef.yo.yo yoVar) {
        if (TextUtils.isEmpty(yoVar.lw()) || TextUtils.isEmpty(yoVar.bs())) {
            return false;
        }
        return new File(yoVar.lw(), yoVar.bs()).exists();
    }

    private static void uef(File[] fileArr, int i5, Set<String> set) {
        if (i5 >= 0 && fileArr != null) {
            try {
                if (fileArr.length > i5) {
                    List listAsList = Arrays.asList(fileArr);
                    Collections.sort(listAsList, new Comparator<File>() { // from class: com.bykv.vk.openvk.uef.uef.oa.uef.uef.uef.1
                        @Override // java.util.Comparator
                        /* renamed from: uef, reason: merged with bridge method [inline-methods] */
                        public int compare(File file, File file2) {
                            long jLastModified = file2.lastModified() - file.lastModified();
                            if (jLastModified == 0) {
                                return 0;
                            }
                            return jLastModified < 0 ? -1 : 1;
                        }
                    });
                    while (i5 < listAsList.size()) {
                        File file = (File) listAsList.get(i5);
                        if (set != null && !set.contains(file.getAbsolutePath())) {
                            ((File) listAsList.get(i5)).delete();
                        }
                        i5++;
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }
}
