package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import androidx.car.app.model.Action;
import com.google.android.apps.auto.components.apphost.menu.WrapperMenuView;
import com.google.android.apps.auto.sdk.ui.AutoTunedRecyclerView;
import com.google.android.apps.auto.sdk.ui.CarRecyclerView;
import com.google.android.apps.auto.sdk.ui.PagedListView;
import com.google.android.apps.auto.sdk.ui.PagedScrollBarView;
import com.google.android.projection.gearhead.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class jxn {
    public static final void a(final jxr jxrVar, cfy cfyVar, bux buxVar, int i) {
        int i2;
        int i3 = i & 6;
        bux buxVarC = buxVar.c(-1367406147);
        if (i3 == 0) {
            i2 = (true != buxVarC.E(jxrVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != buxVarC.C(cfyVar) ? 16 : 32;
        }
        int i4 = 18;
        if (buxVarC.I((i2 & 19) != 18, i2 & 1)) {
            final geu geuVar = (geu) buxVarC.f(gew.a);
            boolean zC = buxVarC.C(jxrVar.e);
            bvv bvvVar = (bvv) buxVarC;
            Object objS = bvvVar.S();
            if (zC || objS == buw.a) {
                objS = new jxi(false);
                bvvVar.ad(objS);
            }
            jxi jxiVar = (jxi) objS;
            boolean zE = buxVarC.E(jxiVar) | buxVarC.E(jxrVar);
            Object objS2 = bvvVar.S();
            if (zE || objS2 == buw.a) {
                objS2 = new grn(jxiVar, jxrVar, i4);
                bvvVar.ad(objS2);
            }
            cfy cfyVarL = bxc.l(cfyVar, (afec) objS2);
            boolean zE2 = buxVarC.E(geuVar);
            Object objS3 = bvvVar.S();
            if (zE2 || objS3 == buw.a) {
                objS3 = new hku(geuVar, i4);
                bvvVar.ad(objS3);
            }
            afec afecVar = (afec) objS3;
            boolean zE3 = buxVarC.E(jxrVar) | buxVarC.E(geuVar);
            Object objS4 = bvvVar.S();
            if (zE3 || objS4 == buw.a) {
                objS4 = new afec() { // from class: jxm
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r11v0 */
                    /* JADX WARN: Type inference failed for: r11v1, types: [com.google.android.apps.auto.sdk.ui.PagedListView] */
                    /* JADX WARN: Type inference failed for: r11v2 */
                    @Override // defpackage.afec
                    public final Object invoke(Object obj) throws Resources.NotFoundException {
                        boolean z;
                        byte[] bArr;
                        ?? r11;
                        List list;
                        Iterator it;
                        TextView textView;
                        PagedListView pagedListView;
                        PagedListView pagedListView2;
                        int iMin;
                        WrapperMenuView wrapperMenuView = (WrapperMenuView) obj;
                        wrapperMenuView.getClass();
                        jtw jtwVar = new jtw(wrapperMenuView, 12);
                        jxr jxrVar2 = jxrVar;
                        jxrVar2.d = jtwVar;
                        geu geuVar2 = geuVar;
                        geuVar2.getClass();
                        wrapperMenuView.d = geuVar2;
                        ArrayList arrayList = new ArrayList();
                        List list2 = jxrVar2.a;
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (next instanceof kdp) {
                                kdp kdpVar = (kdp) next;
                                List list3 = kdpVar.e;
                                int i5 = kdpVar.j;
                                if (i5 == 0) {
                                    throw null;
                                }
                                if (i5 == 1) {
                                    iMin = wrapperMenuView.f;
                                    list = list2;
                                    it = it2;
                                } else {
                                    int i6 = wrapperMenuView.getResources().getDisplayMetrics().widthPixels;
                                    int dimensionPixelSize = wrapperMenuView.getResources().getDimensionPixelSize(R.dimen.tuned_left_right_margin);
                                    int dimensionPixelSize2 = wrapperMenuView.getResources().getDimensionPixelSize(R.dimen.tuned_left_right_padding);
                                    if (i5 == 5) {
                                        gjk gjkVar = gjk.i;
                                        Context context = wrapperMenuView.getContext();
                                        context.getClass();
                                        dimensionPixelSize = gjkVar.a(context);
                                        gjk gjkVar2 = gjk.j;
                                        pagedListView = null;
                                        Context context2 = wrapperMenuView.getContext();
                                        context2.getClass();
                                        dimensionPixelSize2 = gjkVar2.a(context2);
                                    } else {
                                        pagedListView = null;
                                    }
                                    PagedListView pagedListView3 = wrapperMenuView.b;
                                    if (pagedListView3 == null) {
                                        affa.d("pagedListView");
                                        pagedListView3 = pagedListView;
                                    }
                                    int dimensionPixelSize3 = pagedListView3.getResources().getDimensionPixelSize(R.dimen.gearhead_sdk_card_margin);
                                    int i7 = dimensionPixelSize - (true != pagedListView3.i ? 0 : dimensionPixelSize3);
                                    list = list2;
                                    if (true != pagedListView3.j) {
                                        dimensionPixelSize3 = 0;
                                    }
                                    boolean z2 = pagedListView3.l;
                                    int iMax = Math.max(i7, 0);
                                    int iMax2 = Math.max(dimensionPixelSize2 - dimensionPixelSize3, 0);
                                    if (z2) {
                                        AutoTunedRecyclerView autoTunedRecyclerView = pagedListView3.p;
                                        it = it2;
                                        autoTunedRecyclerView.setPaddingRelative(iMax, autoTunedRecyclerView.getPaddingTop(), iMax2, pagedListView3.p.getPaddingBottom());
                                        AutoTunedRecyclerView autoTunedRecyclerView2 = pagedListView3.p;
                                        autoTunedRecyclerView2.setClipToPadding(autoTunedRecyclerView2.getClipChildren());
                                    } else {
                                        it = it2;
                                        CarRecyclerView carRecyclerView = pagedListView3.o;
                                        carRecyclerView.setPaddingRelative(iMax, carRecyclerView.getPaddingTop(), iMax2, pagedListView3.o.getPaddingBottom());
                                        CarRecyclerView carRecyclerView2 = pagedListView3.o;
                                        carRecyclerView2.setClipToPadding(carRecyclerView2.getClipChildren());
                                    }
                                    PagedListView pagedListView4 = wrapperMenuView.b;
                                    if (pagedListView4 == null) {
                                        affa.d("pagedListView");
                                        pagedListView2 = pagedListView;
                                    } else {
                                        pagedListView2 = pagedListView4;
                                    }
                                    pagedListView2.n = nrd.a().c();
                                    int i8 = i6 - (dimensionPixelSize + dimensionPixelSize2);
                                    if (i5 == 5) {
                                        gjk gjkVar3 = gjk.d;
                                        Context context3 = wrapperMenuView.getContext();
                                        context3.getClass();
                                        iMin = Math.min(5, jxc.e(i8, wrapperMenuView.i + gjkVar3.a(context3)));
                                    } else {
                                        int i9 = wrapperMenuView.g;
                                        iMin = Math.min(5, jxc.e(i8 + i9, wrapperMenuView.h + i9));
                                    }
                                }
                                arrayList.addAll(kdl.a(geuVar2, list3, iMin, i5));
                            } else {
                                list = list2;
                                it = it2;
                                if (next instanceof hii) {
                                    hii hiiVar = (hii) next;
                                    List list4 = hiiVar.i;
                                    if (list4.isEmpty()) {
                                        TextView textView2 = wrapperMenuView.a;
                                        if (textView2 == null) {
                                            affa.d("emptyListTextView");
                                            textView = null;
                                        } else {
                                            textView = textView2;
                                        }
                                        textView.setText(String.valueOf(hiiVar.e));
                                    }
                                    arrayList.addAll(guo.h(geuVar2, list4, hiiVar.j));
                                } else if (next instanceof him) {
                                    arrayList.add(guo.g((him) next));
                                } else if (next instanceof gdi) {
                                    arrayList.add(next);
                                } else {
                                    if (!(next instanceof gvy)) {
                                        afhe afheVarB = affw.b(next.getClass());
                                        Objects.toString(afheVarB);
                                        throw new IllegalArgumentException(String.valueOf(afheVarB).concat(" is not supported in #setMenu"));
                                    }
                                    arrayList.add(next);
                                }
                            }
                            it2 = it;
                            list2 = list;
                        }
                        List list5 = list2;
                        leh.a.a();
                        if (list5.isEmpty()) {
                            z = false;
                        } else {
                            for (Object obj2 : list5) {
                                if (((obj2 instanceof kdp) && ((kdp) obj2).i) || ((obj2 instanceof hii) && ((hii) obj2).q)) {
                                    z = true;
                                    break;
                                }
                            }
                            z = false;
                        }
                        AutoTunedRecyclerView autoTunedRecyclerView3 = wrapperMenuView.c;
                        if (autoTunedRecyclerView3 == null) {
                            affa.d("recyclerView");
                            autoTunedRecyclerView3 = null;
                        }
                        Context context4 = wrapperMenuView.getContext();
                        context4.getClass();
                        jtu.e(autoTunedRecyclerView3, context4, true, z);
                        if (arrayList.isEmpty()) {
                            TextView textView3 = wrapperMenuView.a;
                            if (textView3 == null) {
                                affa.d("emptyListTextView");
                                textView3 = null;
                            }
                            textView3.setVisibility(0);
                            AutoTunedRecyclerView autoTunedRecyclerView4 = wrapperMenuView.c;
                            if (autoTunedRecyclerView4 == null) {
                                affa.d("recyclerView");
                                autoTunedRecyclerView4 = null;
                            }
                            autoTunedRecyclerView4.setVisibility(8);
                        } else {
                            TextView textView4 = wrapperMenuView.a;
                            if (textView4 == null) {
                                affa.d("emptyListTextView");
                                textView4 = null;
                            }
                            textView4.setVisibility(8);
                            AutoTunedRecyclerView autoTunedRecyclerView5 = wrapperMenuView.c;
                            if (autoTunedRecyclerView5 == null) {
                                affa.d("recyclerView");
                                autoTunedRecyclerView5 = null;
                            }
                            autoTunedRecyclerView5.setVisibility(0);
                            jxj jxjVar = wrapperMenuView.e;
                            jxl jxlVar = new jxl();
                            int size = jxjVar.f.size();
                            jxjVar.f = arrayList;
                            jxjVar.a = geuVar2;
                            jxjVar.e = jxlVar;
                            if (size == arrayList.size()) {
                                jxjVar.j(0, arrayList.size());
                            } else {
                                jxjVar.g();
                            }
                        }
                        Action action = jxrVar2.b;
                        geuVar2.getClass();
                        if (action == null) {
                            PagedListView pagedListView5 = wrapperMenuView.b;
                            if (pagedListView5 == null) {
                                affa.d("pagedListView");
                                pagedListView5 = null;
                            }
                            PagedScrollBarView pagedScrollBarView = pagedListView5.m;
                            pagedScrollBarView.l = false;
                            if (pagedScrollBarView.i) {
                                pagedScrollBarView.j();
                            } else {
                                pagedScrollBarView.i(true);
                            }
                            bArr = null;
                        } else {
                            Context context5 = wrapperMenuView.getContext();
                            context5.getClass();
                            jxh jxhVar = new jxh(context5);
                            bArr = null;
                            jxhVar.setOnClickListener(new jmq(geuVar2, action, 2, bArr));
                            PagedListView pagedListView6 = wrapperMenuView.b;
                            if (pagedListView6 == null) {
                                affa.d("pagedListView");
                                pagedListView6 = null;
                            }
                            pagedListView6.m(jxhVar);
                        }
                        int iIntValue = jxrVar2.c.intValue();
                        PagedListView pagedListView7 = wrapperMenuView.b;
                        if (pagedListView7 == null) {
                            affa.d("pagedListView");
                            r11 = bArr;
                        } else {
                            r11 = pagedListView7;
                        }
                        r11.l(iIntValue);
                        return afak.a;
                    }
                };
                bvvVar.ad(objS4);
            }
            jur.f(afecVar, cfyVarL, (afec) objS4, buxVarC, 0);
        } else {
            buxVarC.s();
        }
        bxf bxfVarJ = buxVarC.J();
        if (bxfVarJ != null) {
            bxfVarJ.c = new jtt(jxrVar, cfyVar, i, 19);
        }
    }

    public static jxw b() {
        return (jxw) mki.a.i(jxw.class);
    }

    public static kqu c() {
        return (kqu) mki.a.i(kqu.class);
    }

    public static void d(Context context, boolean z, AtomicReference atomicReference) {
        yph yphVar = kow.a;
        if (context.checkSelfPermission("android.permission.BLUETOOTH_CONNECT") != 0) {
            throw new IllegalStateException("Cannot execute injection setting HFP state. Bluetooth permission missing.");
        }
        if (!((BluetoothManager) context.getSystemService(BluetoothManager.class)).getAdapter().isEnabled()) {
            ((ype) ((ype) kow.a.h()).ai((char) 3289)).u("Bluetooth adapter is not enabled. Doing nothing.");
            return;
        }
        kov kovVar = new kov(context);
        try {
            BluetoothHeadset bluetoothHeadset = (BluetoothHeadset) kovVar.a;
            if (z) {
                BluetoothDevice bluetoothDevice = (BluetoothDevice) atomicReference.get();
                if (bluetoothDevice == null) {
                    ((ype) ((ype) kow.a.h()).ai(3286)).u("No device with HFP disconnected earlier to reconnect. Doing nothing.");
                } else {
                    ((ype) kow.a.l().ai(3285)).y("Profile connect result is %s", Boolean.valueOf(bluetoothHeadset.connect(bluetoothDevice)));
                    atomicReference.set(null);
                }
            } else {
                List<BluetoothDevice> connectedDevices = bluetoothHeadset.getConnectedDevices();
                if (connectedDevices.isEmpty()) {
                    ((ype) ((ype) kow.a.h()).ai(3288)).u("No devices with HFP to disconnect. Doing nothing.");
                } else {
                    if (connectedDevices.size() > 1) {
                        throw new IllegalStateException("Unexpectedly found multiple devices with HFP connected");
                    }
                    BluetoothDevice bluetoothDevice2 = connectedDevices.get(0);
                    ((ype) kow.a.l().ai(3287)).y("Profile disconnect result is %s", Boolean.valueOf(bluetoothHeadset.disconnect(bluetoothDevice2)));
                    atomicReference.set(bluetoothDevice2);
                }
            }
            kovVar.close();
        } catch (Throwable th) {
            try {
                kovVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
