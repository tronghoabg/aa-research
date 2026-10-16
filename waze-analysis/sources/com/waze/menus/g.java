package com.waze.menus;

import android.content.Context;
import com.waze.R;
import com.waze.config.ConfigValues;
import com.waze.favorites.FavoritesActivity;
import com.waze.navigate.AddressItem;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29712a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static final f[] f29713b;

    /* renamed from: c, reason: collision with root package name */
    private static final f[] f29714c;

    /* renamed from: d, reason: collision with root package name */
    private static final f[] f29715d;

    /* renamed from: e, reason: collision with root package name */
    private static final f[] f29716e;

    /* renamed from: f, reason: collision with root package name */
    private static final f[] f29717f;

    /* renamed from: g, reason: collision with root package name */
    private static final f[] f29718g;

    /* renamed from: h, reason: collision with root package name */
    private static final f[] f29719h;

    /* renamed from: i, reason: collision with root package name */
    private static final f[] f29720i;

    /* renamed from: j, reason: collision with root package name */
    private static final e f29721j;

    /* renamed from: k, reason: collision with root package name */
    private static final e f29722k;

    /* renamed from: l, reason: collision with root package name */
    private static final e f29723l;
    private static final e m;
    private static final e n;
    private static final e o;
    private static final e p;
    private static final e q;

    static {
        f fVar = f.SEND_LOCATION;
        f fVar2 = f.INFO;
        f fVar3 = f.PARKING;
        f fVar4 = f.ROUTES;
        f fVar5 = f.DELETE;
        f29713b = new f[]{fVar, f.EDIT_WORK, fVar2, fVar3, fVar4, fVar5};
        f29714c = new f[]{fVar, f.EDIT_HOME, fVar2, fVar3, fVar4, fVar5};
        f29715d = new f[]{fVar, f.ADD_FAVORITE, fVar2, fVar3, fVar4, fVar5};
        f fVar6 = f.CALENDAR_SETTINGS;
        f29716e = new f[]{f.CHANGE_LOCATION, fVar2, fVar4, fVar3, fVar6, fVar5};
        f29717f = new f[]{f.EDIT_PLANNED_DRIVE, fVar2, fVar3, fVar6, fVar5};
        f29718g = new f[]{f.SET_LOCATION, fVar2, fVar6, fVar5};
        f fVar7 = f.RENAME_FAVORITE;
        f29719h = new f[]{fVar, fVar4, fVar2, fVar3, fVar7, f.REMOVE_FAVORITE, fVar5};
        f29720i = new f[]{fVar, fVar4, fVar2, fVar3, fVar7, fVar5};
        f29721j = new e();
        f29722k = new e();
        f29723l = new e();
        m = new e();
        n = new e();
        o = new e();
        p = new e();
        q = new e();
    }

    public static void a(Context context, AddressItem addressItem, d dVar) {
        e eVar;
        com.waze.shared_infra.o.a aVarA = com.waze.shared_infra.o.b.a();
        if (addressItem.getType() == 3) {
            f[] fVarArr = f29713b;
            eVar = f29721j;
            b(context, aVarA, fVarArr, eVar);
        } else if (addressItem.getType() == 1) {
            f[] fVarArr2 = f29714c;
            eVar = f29722k;
            b(context, aVarA, fVarArr2, eVar);
        } else if (addressItem.getType() == 11 || addressItem.getType() == 9) {
            if (addressItem.isFutureDrive() && addressItem.hasLocation()) {
                f[] fVarArr3 = f29717f;
                eVar = n;
                b(context, aVarA, fVarArr3, eVar);
            } else if (addressItem.getIsValidate() && addressItem.hasLocation()) {
                f[] fVarArr4 = f29716e;
                eVar = m;
                b(context, aVarA, fVarArr4, eVar);
            } else {
                f[] fVarArr5 = f29718g;
                eVar = o;
                b(context, aVarA, fVarArr5, eVar);
            }
        } else if (addressItem.getType() == 5 || addressItem.getCategory().intValue() == 1) {
            if (context instanceof FavoritesActivity) {
                f[] fVarArr6 = f29720i;
                eVar = q;
                b(context, aVarA, fVarArr6, eVar);
            } else {
                f[] fVarArr7 = f29719h;
                eVar = p;
                b(context, aVarA, fVarArr7, eVar);
            }
        } else if (addressItem.getType() == 8 || addressItem.getType() == 7 || addressItem.getType() == 13) {
            f[] fVarArr8 = f29715d;
            eVar = f29723l;
            b(context, aVarA, fVarArr8, eVar);
        } else {
            eVar = null;
        }
        if (eVar != null) {
            int length = eVar.f29699d.length;
            com.waze.sharedui.g.s[] sVarArr = new com.waze.sharedui.g.s[length];
            for (int i2 = 0; i2 < length; i2++) {
                com.waze.sharedui.g.r rVar = new com.waze.sharedui.g.r(eVar.f29699d[i2], eVar.f29696a[i2]);
                rVar.g(context.getResources().getDrawable(eVar.f29698c[i2]));
                rVar.f(eVar.f29697b[i2]);
                sVarArr[i2] = rVar.c();
            }
            c cVar = new c(context, aVarA.c(R.string.NAVLIST_OPTIONS_INFO, new Object[0]), sVarArr, new b(addressItem, dVar));
            cVar.m(addressItem.getTitle());
            cVar.show();
        }
    }

    private static void b(Context context, com.waze.shared_infra.o.a aVar, f[] fVarArr, e eVar) {
        int i2;
        int length = fVarArr.length;
        if (eVar.f29696a == null) {
            eVar.f29696a = new String[length];
            eVar.f29697b = new String[length];
            eVar.f29698c = new int[length];
            eVar.f29699d = new int[length];
            int i3 = 0;
            for (f fVar : fVarArr) {
                eVar.f29696a[i3] = aVar.c(fVar.c(), new Object[0]);
                eVar.f29697b[i3] = context.getResources().getString(fVar.a());
                int[] iArr = eVar.f29698c;
                switch (fVar) {
                    case ADD_FAVORITE:
                        i2 = R.drawable.navlist_add_favorite;
                        break;
                    case REMOVE_FAVORITE:
                        i2 = R.drawable.navlist_remove_favorite;
                        break;
                    case CHANGE_LOCATION:
                        i2 = R.drawable.navlist_change_location;
                        break;
                    case PARKING:
                        if ("latam".equals(ConfigValues.CONFIG_VALUE_PARKING_SYMBOL_STYLE.b())) {
                            i2 = R.drawable.navlist_parking_pin_latam;
                            break;
                        } else {
                            i2 = R.drawable.navlist_parking;
                            break;
                        }
                    case CALENDAR_SETTINGS:
                        i2 = R.drawable.navlist_calender_settings;
                        break;
                    case INFO:
                        i2 = R.drawable.navlist_info;
                        break;
                    case SEND_LOCATION:
                        i2 = R.drawable.navlist_share_location;
                        break;
                    case ROUTES:
                        i2 = R.drawable.navlist_routes;
                        break;
                    case EDIT_HOME:
                    case EDIT_WORK:
                    case RENAME_FAVORITE:
                        i2 = R.drawable.navlist_edit_location;
                        break;
                    case SET_LOCATION:
                        i2 = R.drawable.navlist_set_location;
                        break;
                    case DELETE:
                        i2 = R.drawable.navlist_delete;
                        break;
                    case SET_START_POINT:
                    default:
                        i2 = 0;
                        break;
                    case EDIT_PLANNED_DRIVE:
                        i2 = R.drawable.navlist_edit_time;
                        break;
                }
                iArr[i3] = i2;
                eVar.f29699d[i3] = fVar.b();
                i3++;
            }
        }
    }
}
