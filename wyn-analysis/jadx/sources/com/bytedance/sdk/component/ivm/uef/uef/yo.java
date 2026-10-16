package com.bytedance.sdk.component.ivm.uef.uef;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.ivm.uef.uef.uef.uef.xs;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class yo implements moa {
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef bcc;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef cz;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef dj;
    private com.bytedance.sdk.component.ivm.uef.uef.uef.uef.lw ivm;
    private com.bytedance.sdk.component.ivm.uef.uef.uef.uef.ivm lw;
    private xs moa;

    /* renamed from: oa, reason: collision with root package name */
    private com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef f25016oa;
    private com.bytedance.sdk.component.ivm.uef.uef.uef.uef.moa uef;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef wrv;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef xs;
    private com.bytedance.sdk.component.ivm.uef.uef.uef.uef.oa yo;
    private com.bytedance.sdk.component.ivm.uef.moa.oa.uef zjm;

    public yo() {
        Context contextLw = com.bytedance.sdk.component.ivm.uef.xs.ivm().lw();
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
            this.xs = com.bytedance.sdk.component.ivm.uef.xs.ivm().dj();
            this.uef = new com.bytedance.sdk.component.ivm.uef.uef.uef.uef.moa(contextLw, this.xs);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
            if (com.bytedance.sdk.component.ivm.uef.xs.ivm().cz() != null) {
                this.cz = com.bytedance.sdk.component.ivm.uef.xs.ivm().cz();
            } else {
                this.cz = com.bytedance.sdk.component.ivm.uef.xs.ivm().wrv();
            }
            this.yo = new com.bytedance.sdk.component.ivm.uef.uef.uef.uef.oa(contextLw, this.cz);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
            this.bcc = com.bytedance.sdk.component.ivm.uef.xs.ivm().wrv();
            this.f25016oa = new com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef(contextLw, this.bcc);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
            this.zjm = com.bytedance.sdk.component.ivm.uef.xs.ivm().wrv();
            this.moa = new xs(contextLw, this.zjm);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
            this.dj = com.bytedance.sdk.component.ivm.uef.xs.ivm().cq();
            this.lw = new com.bytedance.sdk.component.ivm.uef.uef.uef.uef.ivm(contextLw, this.dj);
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
            this.wrv = com.bytedance.sdk.component.ivm.uef.xs.ivm().dz();
            this.ivm = new com.bytedance.sdk.component.ivm.uef.uef.uef.uef.lw(contextLw, this.wrv);
        }
    }

    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> oa(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, int i5) {
        if (uefVar.moa() == 0 && uefVar.lw() == 1 && com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
            if (this.xs.oa() <= i5) {
                return null;
            }
            List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef = this.uef.uef(this.xs.oa() - i5, "_id");
            if (listUef != null && listUef.size() != 0) {
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.ue(), 1);
            }
            return listUef;
        }
        if (uefVar.moa() == 3 && uefVar.lw() == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
            if (this.cz.oa() > i5) {
                return this.yo.uef(this.cz.oa() - i5, "_id");
            }
        } else if (uefVar.moa() == 0 && uefVar.lw() == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
            if (this.bcc.oa() > i5) {
                List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef2 = this.f25016oa.uef(this.bcc.oa() - i5, "_id");
                if (listUef2 != null && listUef2.size() != 0) {
                    com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.pz(), 1);
                }
                return listUef2;
            }
        } else if (uefVar.moa() == 1 && uefVar.lw() == 2 && com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
            if (this.zjm.oa() > i5) {
                List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef3 = this.moa.uef(this.zjm.oa() - i5, "_id");
                if (listUef3 != null && listUef3.size() != 0) {
                    com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.cp(), 1);
                }
                return listUef3;
            }
        } else if (uefVar.moa() == 1 && uefVar.lw() == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
            if (this.dj.oa() > i5) {
                List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef4 = this.lw.uef(this.dj.oa() - i5, "_id");
                if (listUef4 != null && listUef4.size() != 0) {
                    com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.ku(), 1);
                }
                return listUef4;
            }
        } else if (uefVar.moa() == 2 && uefVar.lw() == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.ivm() && this.wrv.oa() > i5) {
            return this.ivm.uef(this.wrv.oa() - i5, "_id");
        }
        return null;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(com.bytedance.sdk.component.ivm.uef.moa.uef uefVar, int i5) {
        if (uefVar == null) {
            return;
        }
        try {
            uefVar.oa(System.currentTimeMillis());
            if (uefVar.moa() == 0 && uefVar.lw() == 1) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
                    this.uef.uef(uefVar);
                    return;
                }
                return;
            }
            if (uefVar.moa() == 3 && uefVar.lw() == 2) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
                    this.yo.uef(uefVar);
                    return;
                }
                return;
            }
            if (uefVar.moa() == 0 && uefVar.lw() == 2) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
                    this.f25016oa.uef(uefVar);
                    return;
                }
                return;
            }
            if (uefVar.moa() == 1 && uefVar.lw() == 2) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
                    this.moa.uef(uefVar);
                }
            } else if (uefVar.moa() == 1 && uefVar.lw() == 3) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
                    this.lw.uef(uefVar);
                }
            } else if (uefVar.moa() == 2 && uefVar.lw() == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
                this.ivm.uef(uefVar);
            }
        } catch (Throwable unused) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.lz(), 1);
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(int i5, List<com.bytedance.sdk.component.ivm.uef.moa.uef> list) {
        if (list == null || list.size() == 0 || list.get(0) == null) {
            return;
        }
        com.bytedance.sdk.component.ivm.uef.moa.uef uefVar = list.get(0);
        if (i5 == 200 || i5 == -1) {
            com.bytedance.sdk.component.ivm.uef.oa.uef.uef uefVar2 = com.bytedance.sdk.component.ivm.uef.oa.moa.moa;
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar2.zou(), list.size());
            if (i5 != 200) {
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(uefVar2.hts(), list.size());
            }
            if (uefVar.moa() == 0 && uefVar.lw() == 1) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
                    this.uef.oa(list);
                    return;
                }
                return;
            }
            if (uefVar.moa() == 3 && uefVar.lw() == 2) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
                    this.yo.oa(list);
                    return;
                }
                return;
            }
            if (uefVar.moa() == 0 && uefVar.lw() == 2) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
                    this.f25016oa.oa(list);
                    return;
                }
                return;
            }
            if (uefVar.moa() == 1 && uefVar.lw() == 2) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
                    this.moa.oa(list);
                }
            } else if (uefVar.moa() == 1 && uefVar.lw() == 3) {
                if (com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
                    this.lw.oa(list);
                }
            } else if (uefVar.moa() == 2 && uefVar.lw() == 3 && com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
                this.ivm.oa(list);
            }
        }
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public List<com.bytedance.sdk.component.ivm.uef.moa.uef> uef(int i5, int i10, List<String> list) {
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef()) {
            List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef = this.uef.uef("_id");
            if (uef(listUef, list)) {
                listUef.size();
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gzw(), 1);
                return listUef;
            }
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw()) {
            List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef2 = this.yo.uef("_id");
            if (uef(listUef2, list)) {
                listUef2.size();
                return listUef2;
            }
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa()) {
            List<com.bytedance.sdk.component.ivm.uef.moa.uef> listUef3 = this.f25016oa.uef("_id");
            if (uef(listUef3, list)) {
                listUef3.size();
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gsd(), 1);
                return listUef3;
            }
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo()) {
            List<com.bytedance.sdk.component.ivm.uef.moa.uef> listOa = this.moa.oa("_id");
            if (uef(listOa, list)) {
                listOa.size();
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.rt(), 1);
                return listOa;
            }
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.moa()) {
            List<com.bytedance.sdk.component.ivm.uef.moa.uef> listOa2 = this.lw.oa("_id");
            if (uef(listOa2, list)) {
                listOa2.size();
                com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.gr(), 1);
                return listOa2;
            }
        }
        if (!com.bytedance.sdk.component.ivm.uef.oa.uef.ivm()) {
            return null;
        }
        List<com.bytedance.sdk.component.ivm.uef.moa.uef> listOa3 = this.ivm.oa("_id");
        if (!uef(listOa3, list)) {
            return null;
        }
        listOa3.size();
        return listOa3;
    }

    private boolean uef(List<com.bytedance.sdk.component.ivm.uef.moa.uef> list, List<String> list2) {
        if (list != null && !list.isEmpty() && list2 != null && !list2.isEmpty()) {
            try {
                Iterator<com.bytedance.sdk.component.ivm.uef.moa.uef> it = list.iterator();
                while (it.hasNext()) {
                    com.bytedance.sdk.component.ivm.uef.moa.uef next = it.next();
                    if (next != null) {
                        String strYo = next.yo();
                        if (!TextUtils.isEmpty(strYo) && list2.contains(strYo)) {
                            it.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                th.getMessage();
            }
        }
        return (list == null || list.isEmpty()) ? false : true;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public boolean uef(int i5, boolean z2) {
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.lw lwVar;
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.ivm ivmVar;
        xs xsVar;
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef uefVar;
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.oa oaVar;
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.moa moaVar;
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.uef() && (moaVar = this.uef) != null && moaVar.uef(i5)) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.dz(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.lw() && (oaVar = this.yo) != null && oaVar.uef(i5)) {
            return true;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.oa() && (uefVar = this.f25016oa) != null && uefVar.uef(i5)) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.wk(), 1);
            return true;
        }
        if (com.bytedance.sdk.component.ivm.uef.oa.uef.yo() && (xsVar = this.moa) != null && xsVar.uef(i5)) {
            com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.ab(), 1);
            return true;
        }
        if (!com.bytedance.sdk.component.ivm.uef.oa.uef.moa() || (ivmVar = this.lw) == null || !ivmVar.uef(i5)) {
            return com.bytedance.sdk.component.ivm.uef.oa.uef.ivm() && (lwVar = this.ivm) != null && lwVar.uef(i5);
        }
        com.bytedance.sdk.component.ivm.uef.yo.oa.uef(com.bytedance.sdk.component.ivm.uef.oa.moa.moa.bs(), 1);
        return true;
    }

    @Override // com.bytedance.sdk.component.ivm.uef.uef.moa
    public void uef(int i5, long j8) {
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.moa moaVar = this.uef;
        if (moaVar != null) {
            moaVar.uef(i5, j8);
        }
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.oa oaVar = this.yo;
        if (oaVar != null) {
            oaVar.uef(i5, j8);
        }
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.uef uefVar = this.f25016oa;
        if (uefVar != null) {
            uefVar.uef(i5, j8);
        }
        xs xsVar = this.moa;
        if (xsVar != null) {
            xsVar.uef(i5, j8);
        }
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.ivm ivmVar = this.lw;
        if (ivmVar != null) {
            ivmVar.uef(i5, j8);
        }
        com.bytedance.sdk.component.ivm.uef.uef.uef.uef.lw lwVar = this.ivm;
        if (lwVar != null) {
            lwVar.uef(i5, j8);
        }
    }
}
