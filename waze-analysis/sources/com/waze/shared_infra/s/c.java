package com.waze.shared_infra.s;

import com.google.v.dm;
import com.google.v.du;
import com.waze.ce.q;
import com.waze.ce.r;
import h.g.b.x;
import java.util.LinkedHashSet;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.am;
import l.a.afr;
import l.a.afx;
import l.a.awz;
import l.a.bba;
import l.a.bgp;
import l.a.bgq;
import l.a.bgr;
import l.a.bgs;
import l.a.bgw;
import l.a.bgz;
import l.a.bhd;
import l.a.bhf;
import l.a.bhh;
import l.a.bhj;
import l.a.bhl;
import l.a.bhu;
import l.a.bhw;
import l.a.bis;
import l.a.biu;
import l.a.bix;
import l.a.bjb;
import l.a.bjc;
import l.a.bjd;
import l.a.bje;
import l.a.bjl;
import l.a.bjn;
import l.a.bju;
import l.a.bjw;
import l.a.bkh;
import l.a.bkl;
import l.a.bkq;
import l.a.bkt;
import l.a.bkw;
import l.a.bla;
import l.a.blb;
import l.a.blc;
import l.a.bld;
import l.a.ble;
import l.a.bln;
import l.a.blt;
import l.a.bly;
import l.a.blz;
import l.a.bmb;
import l.a.bqu;
import l.a.bti;
import l.a.ha;
import l.a.qd;
import l.a.qf;
import l.a.qh;
import l.a.qj;
import l.a.sz;
import l.a.tb;
import l.a.tm;
import l.a.tn;
import l.a.wi;
import l.a.wj;
import okhttp3.au;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Object f38004a;

    public c(ThreadFactory threadFactory) {
        x.f(threadFactory, "threadFactory");
        this.f38004a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
    }

    public static final void i(okhttp3.internal.b.e eVar) {
        x.f(eVar, "taskRunner");
        eVar.notify();
    }

    public final void A(qf qfVar) {
        x.f(qfVar, "value");
        ((qh) this.f38004a).b(qfVar);
    }

    public final /* synthetic */ bmb B() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (bmb) duVarBuild;
    }

    public final void C(bix bixVar) {
        x.f(bixVar, "value");
        ((blz) this.f38004a).d(bixVar);
    }

    public final void D(bjb bjbVar) {
        x.f(bjbVar, "value");
        ((blz) this.f38004a).e(bjbVar);
    }

    public final void E(bkh bkhVar) {
        x.f(bkhVar, "value");
        ((blz) this.f38004a).g(bkhVar);
    }

    public final void F(bkl bklVar) {
        x.f(bklVar, "value");
        ((blz) this.f38004a).h(bklVar);
    }

    public final void G(bkq bkqVar) {
        x.f(bkqVar, "value");
        ((blz) this.f38004a).j(bkqVar);
    }

    public final void H(bkt bktVar) {
        x.f(bktVar, "value");
        ((blz) this.f38004a).k(bktVar);
    }

    public final void I(bkw bkwVar) {
        x.f(bkwVar, "value");
        ((blz) this.f38004a).l(bkwVar);
    }

    public final void J(blc blcVar) {
        x.f(blcVar, "value");
        ((blz) this.f38004a).n(blcVar);
    }

    public final void K(ble bleVar) {
        x.f(bleVar, "value");
        ((blz) this.f38004a).o(bleVar);
    }

    public final void L(bln blnVar) {
        x.f(blnVar, "value");
        ((blz) this.f38004a).q(blnVar);
    }

    public final void M(blt bltVar) {
        x.f(bltVar, "value");
        ((blz) this.f38004a).s(bltVar);
    }

    public final void N(bly blyVar) {
        x.f(blyVar, "value");
        ((blz) this.f38004a).t(blyVar);
    }

    public final /* synthetic */ ble O() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (ble) duVarBuild;
    }

    public final void P(boolean z) {
        ((bld) this.f38004a).a(z);
    }

    public final /* synthetic */ blc Q() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (blc) duVarBuild;
    }

    public final void R(blb blbVar) {
        x.f(blbVar, "value");
        ((bla) this.f38004a).a(blbVar);
    }

    public final /* synthetic */ bjn S() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (bjn) duVarBuild;
    }

    public final void T(ha haVar) {
        x.f(haVar, "value");
        ((bjl) this.f38004a).a(haVar);
    }

    public final void U(afr afrVar) {
        x.f(afrVar, "value");
        ((bjl) this.f38004a).b(afrVar);
    }

    public final void V(bju bjuVar) {
        x.f(bjuVar, "value");
        ((bjl) this.f38004a).c(bjuVar);
    }

    public final void W(bjw bjwVar) {
        x.f(bjwVar, "value");
        ((bjl) this.f38004a).d(bjwVar);
    }

    public final void X(bti btiVar) {
        x.f(btiVar, "value");
        ((bjl) this.f38004a).e(btiVar);
    }

    public final /* synthetic */ bje Y() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (bje) duVarBuild;
    }

    public final void Z(long j2) {
        ((bjc) this.f38004a).a(j2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlinx.coroutines.am] */
    public final am a() {
        return this.f38004a;
    }

    public final void aa(double d2) {
        ((bjc) this.f38004a).b(d2);
    }

    public final void ab(double d2) {
        ((bjc) this.f38004a).c(d2);
    }

    public final void ac(afx afxVar) {
        x.f(afxVar, "value");
        ((bjc) this.f38004a).d(afxVar);
    }

    public final void ad(double d2) {
        ((bjc) this.f38004a).e(d2);
    }

    public final void ae(bjd bjdVar) {
        x.f(bjdVar, "value");
        ((bjc) this.f38004a).f(bjdVar);
    }

    public final void af(double d2) {
        ((bjc) this.f38004a).g(d2);
    }

    public final void ag(long j2) {
        ((bjc) this.f38004a).h(j2);
    }

    public final void ah(double d2) {
        ((bjc) this.f38004a).i(d2);
    }

    public final /* synthetic */ biu ai() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (biu) duVarBuild;
    }

    public final void aj(double d2) {
        ((bis) this.f38004a).a(d2);
    }

    public final void ak(String str) {
        x.f(str, "value");
        ((bis) this.f38004a).b(str);
    }

    public final /* synthetic */ bhl al() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (bhl) duVarBuild;
    }

    public final void am(bhu bhuVar) {
        x.f(bhuVar, "value");
        ((bhj) this.f38004a).a(bhuVar);
    }

    public final void an(bhw bhwVar) {
        x.f(bhwVar, "value");
        ((bhj) this.f38004a).b(bhwVar);
    }

    public final /* synthetic */ bgs ao() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (bgs) duVarBuild;
    }

    public final void ap(bgq bgqVar) {
        x.f(bgqVar, "value");
        ((bgp) this.f38004a).a(bgqVar);
    }

    public final void aq(afx afxVar) {
        x.f(afxVar, "value");
        ((bgp) this.f38004a).b(afxVar);
    }

    public final void ar(bgr bgrVar) {
        x.f(bgrVar, "value");
        ((bgp) this.f38004a).c(bgrVar);
    }

    public final void as(awz awzVar) {
        x.f(awzVar, "value");
        ((bgp) this.f38004a).d(awzVar);
    }

    public final void at(String str) {
        x.f(str, "value");
        ((bgp) this.f38004a).e(str);
    }

    public final /* synthetic */ r b() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (r) duVarBuild;
    }

    public final void c(String str) {
        x.f(str, "value");
        ((q) this.f38004a).a(str);
    }

    public final void d(int i2) {
        ((q) this.f38004a).b(i2);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized void e(au auVar) {
        x.f(auVar, "route");
        this.f38004a.remove(auVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized void f(au auVar) {
        x.f(auVar, "failedRoute");
        this.f38004a.add(auVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Set] */
    public final synchronized boolean g(au auVar) {
        x.f(auVar, "route");
        return this.f38004a.contains(auVar);
    }

    public final void h(Runnable runnable) {
        x.f(runnable, "runnable");
        ((ThreadPoolExecutor) this.f38004a).execute(runnable);
    }

    public final /* synthetic */ wj j() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (wj) duVarBuild;
    }

    public final void k(long j2) {
        ((wi) this.f38004a).a(j2);
    }

    public final void l(boolean z) {
        ((wi) this.f38004a).b(z);
    }

    public final void m(boolean z) {
        ((wi) this.f38004a).c(z);
    }

    public final /* synthetic */ tn n() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (tn) duVarBuild;
    }

    public final void o(long j2) {
        ((tm) this.f38004a).a(j2);
    }

    public final void p(long j2) {
        ((tm) this.f38004a).b(j2);
    }

    public final /* synthetic */ tb q() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (tb) duVarBuild;
    }

    public final void r(bba bbaVar) {
        x.f(bbaVar, "value");
        ((sz) this.f38004a).a(bbaVar);
    }

    public final void s(bgw bgwVar) {
        x.f(bgwVar, "value");
        ((sz) this.f38004a).b(bgwVar);
    }

    public final void t(bgz bgzVar) {
        x.f(bgzVar, "value");
        ((sz) this.f38004a).c(bgzVar);
    }

    public final void u(bhd bhdVar) {
        x.f(bhdVar, "value");
        ((sz) this.f38004a).d(bhdVar);
    }

    public final void v(bhf bhfVar) {
        x.f(bhfVar, "value");
        ((sz) this.f38004a).e(bhfVar);
    }

    public final void w(bhh bhhVar) {
        x.f(bhhVar, "value");
        ((sz) this.f38004a).f(bhhVar);
    }

    public final void x(bqu bquVar) {
        x.f(bquVar, "value");
        ((sz) this.f38004a).g(bquVar);
    }

    public final /* synthetic */ qj y() {
        du duVarBuild = ((dm) this.f38004a).build();
        x.e(duVarBuild, "build(...)");
        return (qj) duVarBuild;
    }

    public final void z(qd qdVar) {
        x.f(qdVar, "value");
        ((qh) this.f38004a).a(qdVar);
    }

    public c(am amVar) {
        x.f(amVar, "result");
        this.f38004a = amVar;
    }

    public /* synthetic */ c(dm dmVar) {
        this.f38004a = dmVar;
    }

    public c() {
        this.f38004a = new LinkedHashSet();
    }
}
