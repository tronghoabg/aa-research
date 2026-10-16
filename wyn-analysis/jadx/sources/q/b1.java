package q;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import com.wynauto.wyn.R;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import q1.AbstractC3855a;

/* loaded from: classes.dex */
public final class b1 extends AbstractC3855a implements View.OnClickListener {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f43742y = 0;

    /* renamed from: i, reason: collision with root package name */
    public final int f43743i;

    /* renamed from: j, reason: collision with root package name */
    public final int f43744j;
    public final LayoutInflater k;

    /* renamed from: l, reason: collision with root package name */
    public final SearchView f43745l;

    /* renamed from: m, reason: collision with root package name */
    public final SearchableInfo f43746m;

    /* renamed from: n, reason: collision with root package name */
    public final Context f43747n;

    /* renamed from: o, reason: collision with root package name */
    public final WeakHashMap f43748o;

    /* renamed from: p, reason: collision with root package name */
    public final int f43749p;

    /* renamed from: q, reason: collision with root package name */
    public int f43750q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f43751r;

    /* renamed from: s, reason: collision with root package name */
    public int f43752s;

    /* renamed from: t, reason: collision with root package name */
    public int f43753t;

    /* renamed from: u, reason: collision with root package name */
    public int f43754u;

    /* renamed from: v, reason: collision with root package name */
    public int f43755v;

    /* renamed from: w, reason: collision with root package name */
    public int f43756w;

    /* renamed from: x, reason: collision with root package name */
    public int f43757x;

    public b1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.f43965b = true;
        this.f43966c = null;
        this.f43964a = false;
        this.f43967d = context;
        this.f43968e = -1;
        this.f43969f = new io.flutter.view.c(this);
        this.f43970g = new D0(this, 1);
        this.f43744j = suggestionRowLayout;
        this.f43743i = suggestionRowLayout;
        this.k = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f43750q = 1;
        this.f43752s = -1;
        this.f43753t = -1;
        this.f43754u = -1;
        this.f43755v = -1;
        this.f43756w = -1;
        this.f43757x = -1;
        this.f43745l = searchView;
        this.f43746m = searchableInfo;
        this.f43749p = searchView.getSuggestionCommitIconResId();
        this.f43747n = context;
        this.f43748o = weakHashMap;
    }

    public static String h(Cursor cursor, int i5) {
        if (i5 == -1) {
            return null;
        }
        try {
            return cursor.getString(i5);
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e7);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0131  */
    @Override // q1.AbstractC3855a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 419
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b1.a(android.view.View, android.database.Cursor):void");
    }

    @Override // q1.AbstractC3855a
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f43752s = cursor.getColumnIndex("suggest_text_1");
                this.f43753t = cursor.getColumnIndex("suggest_text_2");
                this.f43754u = cursor.getColumnIndex("suggest_text_2_url");
                this.f43755v = cursor.getColumnIndex("suggest_icon_1");
                this.f43756w = cursor.getColumnIndex("suggest_icon_2");
                this.f43757x = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e7) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e7);
        }
    }

    @Override // q1.AbstractC3855a
    public final String c(Cursor cursor) {
        String strH;
        String strH2;
        if (cursor == null) {
            return null;
        }
        String strH3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
        if (strH3 != null) {
            return strH3;
        }
        SearchableInfo searchableInfo = this.f43746m;
        if (searchableInfo.shouldRewriteQueryFromData() && (strH2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
            return strH2;
        }
        if (!searchableInfo.shouldRewriteQueryFromText() || (strH = h(cursor, cursor.getColumnIndex("suggest_text_1"))) == null) {
            return null;
        }
        return strH;
    }

    @Override // q1.AbstractC3855a
    public final View d(ViewGroup viewGroup) {
        View viewInflate = this.k.inflate(this.f43743i, viewGroup, false);
        viewInflate.setTag(new a1(viewInflate));
        ((ImageView) viewInflate.findViewById(R.id.edit_query)).setImageResource(this.f43749p);
        return viewInflate;
    }

    public final Drawable e(Uri uri) throws PackageManager.NameNotFoundException, NumberFormatException, FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException(pd.f.k(uri, "No authority: "));
        }
        try {
            Resources resourcesForApplication = this.f43747n.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException(pd.f.k(uri, "No path: "));
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException(pd.f.k(uri, "Single path segment is not a resource ID: "));
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException(pd.f.k(uri, "More than two path segments: "));
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException(pd.f.k(uri, "No resource found for: "));
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException(pd.f.k(uri, "No package found for authority: "));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) throws android.content.pm.PackageManager.NameNotFoundException, java.lang.NumberFormatException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.b1.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        builderFragment.appendQueryParameter("limit", String.valueOf(50));
        return this.f43747n.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // q1.AbstractC3855a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i5, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewInflate = this.k.inflate(this.f43744j, viewGroup, false);
            if (viewInflate != null) {
                ((a1) viewInflate.getTag()).f43735a.setText(e7.toString());
            }
            return viewInflate;
        }
    }

    @Override // q1.AbstractC3855a, android.widget.Adapter
    public final View getView(int i5, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i5, view, viewGroup);
        } catch (RuntimeException e7) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e7);
            View viewD = d(viewGroup);
            ((a1) viewD.getTag()).f43735a.setText(e7.toString());
            return viewD;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Cursor cursor = this.f43966c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        Cursor cursor = this.f43966c;
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f43745l.r((CharSequence) tag);
        }
    }
}
