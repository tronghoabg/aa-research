.class public final LHf/d0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LHf/g0;
.implements LHf/d;
.implements LIf/w;


# instance fields
.field public final synthetic a:LHf/b0;


# direct methods
.method public constructor <init>(LHf/b0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LHf/d0;->a:LHf/b0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljf/h;ILGf/a;)LHf/l;
    .locals 0

    .line 1
    invoke-static {p0, p1, p2, p3}, LHf/k0;->t(LHf/g0;Ljf/h;ILGf/a;)LHf/l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    return-object p1
.end method

.method public final collect(LHf/m;Ljf/c;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LHf/d0;->a:LHf/b0;

    .line 2
    .line 3
    invoke-interface {v0, p1, p2}, LHf/l;->collect(LHf/m;Ljf/c;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    return-object p1
.end method
