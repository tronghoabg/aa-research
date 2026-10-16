package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.ag;
import android.support.v7.view.menu.y;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public final class e implements a {

    /* renamed from: a, reason: collision with root package name */
    final ActionMode.Callback f676a;

    /* renamed from: b, reason: collision with root package name */
    final Context f677b;

    /* renamed from: c, reason: collision with root package name */
    final ArrayList f678c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    final SimpleArrayMap f679d = new SimpleArrayMap();

    public e(Context context, ActionMode.Callback callback) {
        this.f677b = context;
        this.f676a = callback;
    }

    private final Menu f(Menu menu) {
        SimpleArrayMap simpleArrayMap = this.f679d;
        Menu menu2 = (Menu) simpleArrayMap.get(menu);
        if (menu2 != null) {
            return menu2;
        }
        ag agVar = new ag(this.f677b, (SupportMenu) menu);
        simpleArrayMap.put(menu, agVar);
        return agVar;
    }

    @Override // android.support.v7.view.a
    public final void a(b bVar) {
        this.f676a.onDestroyActionMode(e(bVar));
    }

    @Override // android.support.v7.view.a
    public final boolean b(b bVar, MenuItem menuItem) {
        return this.f676a.onActionItemClicked(e(bVar), new y(this.f677b, (SupportMenuItem) menuItem));
    }

    @Override // android.support.v7.view.a
    public final boolean c(b bVar, Menu menu) {
        return this.f676a.onCreateActionMode(e(bVar), f(menu));
    }

    @Override // android.support.v7.view.a
    public final boolean d(b bVar, Menu menu) {
        return this.f676a.onPrepareActionMode(e(bVar), f(menu));
    }

    public final ActionMode e(b bVar) {
        ArrayList arrayList = this.f678c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = (f) arrayList.get(i2);
            if (fVar != null && fVar.f681b == bVar) {
                return fVar;
            }
        }
        f fVar2 = new f(this.f677b, bVar);
        arrayList.add(fVar2);
        return fVar2;
    }
}
