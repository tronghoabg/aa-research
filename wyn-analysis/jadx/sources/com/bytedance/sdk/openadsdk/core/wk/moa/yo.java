package com.bytedance.sdk.openadsdk.core.wk.moa;

import com.bykv.vk.openvk.uef.uef.oa.yo.moa;
import com.bykv.vk.openvk.uef.uef.uef.uef;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class yo extends moa {
    private final uef moa;
    private final List<oa> uef = DesugarCollections.synchronizedList(new ArrayList());

    /* renamed from: oa, reason: collision with root package name */
    private int f25791oa = 1;
    private int yo = 1;

    public interface oa extends uef.InterfaceC0034uef {
        void uef(int i5, int i10);
    }

    public yo() {
        uef uefVar = new uef();
        this.moa = uefVar;
        super.uef(uefVar);
        uef(500);
    }

    public static /* synthetic */ int uef(yo yoVar) {
        int i5 = yoVar.yo;
        yoVar.yo = i5 + 1;
        return i5;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.moa
    public long bs() {
        return super.bs() * this.f25791oa;
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.moa
    public long sy() {
        long jSy = super.sy();
        return this.f25791oa == 1 ? jSy : ((this.yo - 1) * super.bs()) + jSy;
    }

    public int tpx() {
        return this.yo;
    }

    public class uef implements uef.InterfaceC0034uef {
        private uef() {
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void lw(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).lw(uefVar);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void moa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).moa(uefVar);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void oa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).oa(uefVar);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            yo.uef(yo.this);
            if (yo.this.yo > yo.this.f25791oa) {
                Iterator it = yo.this.uef.iterator();
                while (it.hasNext()) {
                    ((oa) it.next()).uef(uefVar);
                }
            } else {
                Iterator it2 = yo.this.uef.iterator();
                while (it2.hasNext()) {
                    ((oa) it2.next()).uef(yo.this.yo, yo.this.f25791oa);
                }
                yo.this.cz();
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void yo(com.bykv.vk.openvk.uef.uef.uef.uef uefVar) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).yo(uefVar);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void oa(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).oa(uefVar, i5);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, long j8) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, j8);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, com.bykv.vk.openvk.uef.uef.uef.yo.uef uefVar2) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, uefVar2);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, boolean z2) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, z2);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5, int i10) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, i5, i10);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5, int i10, int i11) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, i5, i10, i11);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, int i5) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, i5);
            }
        }

        @Override // com.bykv.vk.openvk.uef.uef.uef.uef.InterfaceC0034uef
        public void uef(com.bykv.vk.openvk.uef.uef.uef.uef uefVar, long j8, long j10) {
            Iterator it = yo.this.uef.iterator();
            while (it.hasNext()) {
                ((oa) it.next()).uef(uefVar, j8, j10);
            }
        }
    }

    @Override // com.bykv.vk.openvk.uef.uef.oa.yo.moa
    public void uef(uef.InterfaceC0034uef interfaceC0034uef) {
        if (!(interfaceC0034uef instanceof oa)) {
            super.uef(interfaceC0034uef);
        } else {
            if (this.uef.contains(interfaceC0034uef)) {
                return;
            }
            this.uef.add((oa) interfaceC0034uef);
        }
    }

    public void yo(int i5) {
        this.f25791oa = Math.max(1, i5);
    }
}
