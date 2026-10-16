package com.google.android.projection.gearhead.companion.feedback;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.projection.gearhead.R;
import defpackage.lbk;
import defpackage.wwt;
import defpackage.wzt;

/* loaded from: classes3.dex */
public class FeedbackListActivity extends Activity {
    private wzt a;

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.feedback_list_activity);
        String absolutePath = lbk.c(this).getAbsolutePath();
        ListView listView = (ListView) findViewById(R.id.feedback_list);
        listView.setEmptyView(findViewById(R.id.feedback_list_empty));
        wzt wztVar = new wzt(absolutePath, this);
        this.a = wztVar;
        listView.setAdapter((ListAdapter) wztVar);
        findViewById(R.id.add_feedback_report).setOnClickListener(new wwt(this, 14));
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        wzt wztVar = this.a;
        wztVar.a();
        wztVar.a.startWatching();
    }

    @Override // android.app.Activity
    protected final void onStop() {
        this.a.a.stopWatching();
        super.onStop();
    }
}
