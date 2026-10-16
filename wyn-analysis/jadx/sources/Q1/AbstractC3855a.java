package q1;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import io.flutter.view.c;
import ka.AbstractC3256n;
import q.D0;
import q.b1;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3855a extends BaseAdapter implements Filterable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f43964a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f43965b;

    /* renamed from: c, reason: collision with root package name */
    public Cursor f43966c;

    /* renamed from: d, reason: collision with root package name */
    public Context f43967d;

    /* renamed from: e, reason: collision with root package name */
    public int f43968e;

    /* renamed from: f, reason: collision with root package name */
    public c f43969f;

    /* renamed from: g, reason: collision with root package name */
    public D0 f43970g;

    /* renamed from: h, reason: collision with root package name */
    public C3856b f43971h;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f43966c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                c cVar = this.f43969f;
                if (cVar != null) {
                    cursor2.unregisterContentObserver(cVar);
                }
                D0 d02 = this.f43970g;
                if (d02 != null) {
                    cursor2.unregisterDataSetObserver(d02);
                }
            }
            this.f43966c = cursor;
            if (cursor != null) {
                c cVar2 = this.f43969f;
                if (cVar2 != null) {
                    cursor.registerContentObserver(cVar2);
                }
                D0 d03 = this.f43970g;
                if (d03 != null) {
                    cursor.registerDataSetObserver(d03);
                }
                this.f43968e = cursor.getColumnIndexOrThrow("_id");
                this.f43964a = true;
                notifyDataSetChanged();
            } else {
                this.f43968e = -1;
                this.f43964a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f43964a || (cursor = this.f43966c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f43964a) {
            return null;
        }
        this.f43966c.moveToPosition(i5);
        if (view == null) {
            b1 b1Var = (b1) this;
            view = b1Var.k.inflate(b1Var.f43744j, viewGroup, false);
        }
        a(view, this.f43966c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f43971h == null) {
            C3856b c3856b = new C3856b();
            c3856b.f43972a = this;
            this.f43971h = c3856b;
        }
        return this.f43971h;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i5) {
        Cursor cursor;
        if (!this.f43964a || (cursor = this.f43966c) == null) {
            return null;
        }
        cursor.moveToPosition(i5);
        return this.f43966c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i5) {
        Cursor cursor;
        if (this.f43964a && (cursor = this.f43966c) != null && cursor.moveToPosition(i5)) {
            return this.f43966c.getLong(this.f43968e);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (!this.f43964a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f43966c.moveToPosition(i5)) {
            throw new IllegalStateException(AbstractC3256n.g(i5, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = d(viewGroup);
        }
        a(view, this.f43966c);
        return view;
    }
}
