.class public final Lmd/g;
.super Lmd/d;
.source "SourceFile"


# instance fields
.field public final a:Lmd/d;

.field public final b:Lud/g;


# direct methods
.method public constructor <init>(Lmd/d;Lud/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmd/g;->a:Lmd/d;

    .line 5
    .line 6
    const-string p1, "interceptor"

    .line 7
    .line 8
    invoke-static {p2, p1}, LFe/e;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iput-object p2, p0, Lmd/g;->b:Lud/g;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lmd/g;->a:Lmd/d;

    .line 2
    .line 3
    invoke-virtual {v0}, Lmd/d;->g()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final h(LF6/r;Lmd/c;)Lmd/f;
    .locals 3

    .line 1
    iget-object v0, p0, Lmd/g;->a:Lmd/d;

    .line 2
    .line 3
    iget-object v1, p0, Lmd/g;->b:Lud/g;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lud/f;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lmd/d;->h(LF6/r;Lmd/c;)Lmd/f;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-direct {v2, v1, p1}, Lud/f;-><init>(Lud/g;Lmd/f;)V

    .line 15
    .line 16
    .line 17
    return-object v2
.end method
