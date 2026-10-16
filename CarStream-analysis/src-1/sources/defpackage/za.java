package defpackage;

import android.location.LocationManager;
import android.os.Handler;
import android.os.SystemClock;
import android.widget.FrameLayout;
import com.carstream.tech.car.CarScreen;
import com.carstream.tech.car.e;
import com.carstream.tech.core.speed.SpeedBubble;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-0308adb7379ba4f751dce57ff165d4b8556222573b5bec89923a9da20a3bb2b7 */
/* loaded from: classes.dex */
public final class za {
    public static c1 h;
    public final e a;
    public final Handler b;
    public SpeedBubble c;
    public String d;
    public final y1 e = new y1(this, 3);
    public final h2 f;
    public final i2 g;

    public za(e eVar, Handler handler) {
        int i = 2;
        this.f = new h2(this, i);
        this.g = new i2(this, i);
        this.a = eVar;
        this.b = handler;
    }

    public static String a(FrameLayout frameLayout) {
        return "speedX_" + frameLayout.getWidth() + "x" + frameLayout.getHeight();
    }

    public static String b(FrameLayout frameLayout) {
        return "speedY_" + frameLayout.getWidth() + "x" + frameLayout.getHeight();
    }

    public static int e(int i, int i2) {
        return Math.max(0, Math.min(i, Math.max(0, i2)));
    }

    public final void c() {
        ab abVar;
        e eVar = this.a;
        CarScreen carScreen = eVar.b;
        if (this.c == null) {
            return;
        }
        String strG = xc.g(carScreen, "speedStyle", "pill");
        if (!strG.equals(this.d)) {
            d(strG);
        }
        this.c.B(xc.l(eVar.b).getInt(xc.h("speedScale"), 100) / 100.0f);
        SpeedBubble speedBubble = this.c;
        int i = xc.l(carScreen).getInt(xc.h("speedAlpha"), 100);
        if (i < 20) {
            i = 20;
        }
        speedBubble.getClass();
        float fMax = Math.max(0.0f, Math.min(1.0f, Math.min(i, 100) / 100.0f));
        if (fMax != speedBubble.s) {
            speedBubble.s = fMax;
            speedBubble.invalidate();
        }
        this.c.z(xc.l(carScreen).getBoolean(xc.h("speedSignsOnly"), false));
        boolean z = carScreen.getApplicationContext().getSharedPreferences("CanhNhatTube", 0).getBoolean(xc.h("showSpeed"), false);
        this.c.setVisibility(z ? 0 : 8);
        i2 i2Var = this.g;
        h2 h2Var = this.f;
        if (!z) {
            CopyOnWriteArrayList copyOnWriteArrayList = cb.e;
            copyOnWriteArrayList.remove(h2Var);
            if (copyOnWriteArrayList.isEmpty() && cb.f.isEmpty()) {
                LocationManager locationManager = cb.h;
                if (locationManager != null && (abVar = cb.i) != null) {
                    try {
                        locationManager.removeUpdates(abVar);
                    } catch (Throwable unused) {
                    }
                }
                cb.i = null;
            }
            w7.l.remove(i2Var);
            return;
        }
        FrameLayout frameLayout = eVar.b.rootLayout;
        SpeedBubble speedBubble2 = this.c;
        if (speedBubble2 != null && frameLayout != null) {
            speedBubble2.post(new t(this, frameLayout, 8));
        }
        this.c.A(w7.g());
        f();
        w7.a(i2Var);
        if (cb.b(carScreen)) {
            cb.a(carScreen, h2Var);
        }
    }

    public final void d(String str) {
        CarScreen carScreen = this.a.b;
        FrameLayout frameLayout = carScreen.rootLayout;
        SpeedBubble speedBubble = this.c;
        if (speedBubble != null) {
            frameLayout.removeView(speedBubble);
        }
        SpeedBubble speedBubbleH = w1.h(carScreen, str);
        this.c = speedBubbleH;
        speedBubbleH.B(xc.l(r0.b).getInt(xc.h("speedScale"), 100) / 100.0f);
        this.d = str;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388659;
        this.c.setVisibility(8);
        frameLayout.addView(this.c, layoutParams);
        this.c.setOnTouchListener(new ya(this));
    }

    public final void f() {
        ArrayList arrayList;
        char c;
        SpeedBubble speedBubble = this.c;
        if (speedBubble != null) {
            int i = w7.a;
            u7 u7Var = null;
            if (System.currentTimeMillis() - w7.e <= 30000 && !w7.i) {
                List listJ = w7.j(w7.g);
                if (!listJ.isEmpty()) {
                    u7Var = (u7) listJ.get(0);
                }
            }
            if (System.currentTimeMillis() - w7.e > 30000) {
                arrayList = new ArrayList();
            } else if (w7.i) {
                arrayList = new ArrayList();
                for (u7 u7Var2 : w7.j) {
                    if (u7Var2 != null && u7Var2.b > 0) {
                        arrayList.add(u7Var2);
                    }
                    if (arrayList.size() == 2) {
                        break;
                    }
                }
            } else {
                List<u7> listJ2 = w7.j(w7.f);
                ConcurrentHashMap concurrentHashMap = w7.s;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                HashSet hashSet = new HashSet();
                for (u7 u7Var3 : listJ2) {
                    String str = u7Var3.d;
                    if (str != null) {
                        hashSet.add(str);
                        long[] jArr = (long[]) concurrentHashMap.get(u7Var3.d);
                        if (jArr != null) {
                            c = 1;
                            if (jArr[0] != u7Var3.b) {
                            }
                        } else {
                            c = 1;
                        }
                        String str2 = u7Var3.d;
                        long j = u7Var3.b;
                        long[] jArr2 = new long[2];
                        jArr2[0] = j;
                        jArr2[c] = jElapsedRealtime;
                        concurrentHashMap.put(str2, jArr2);
                    }
                }
                concurrentHashMap.keySet().retainAll(hashSet);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList arrayList2 = new ArrayList();
                for (u7 u7Var4 : listJ2) {
                    int iH = w7.h(u7Var4);
                    String str3 = u7Var4.d;
                    if (iH > 0) {
                        if (str3 != null) {
                            if (iH > 100) {
                                w7.t.remove(str3);
                            } else if (w7.t.containsKey(str3)) {
                            }
                        }
                        arrayList2.add(u7Var4);
                    } else if (str3 != null) {
                        w7.t.put(str3, Long.valueOf(jCurrentTimeMillis));
                    }
                }
                ConcurrentHashMap concurrentHashMap2 = w7.t;
                if (!concurrentHashMap2.isEmpty()) {
                    Iterator it = concurrentHashMap2.values().iterator();
                    while (it.hasNext()) {
                        if (jCurrentTimeMillis - ((Long) it.next()).longValue() > 120000) {
                            it.remove();
                        }
                    }
                }
                Collections.sort(arrayList2, new c6(1));
                arrayList = arrayList2.size() > 2 ? new ArrayList(arrayList2.subList(0, 2)) : arrayList2;
            }
            speedBubble.C(u7Var, arrayList);
        }
    }
}
