.class public final Lvd/p;
.super Lmd/h;
.source "SourceFile"


# instance fields
.field public final a:Lvd/k;

.field public final b:Lvd/p;


# direct methods
.method public constructor <init>(Lvd/k;Lvd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvd/p;->a:Lvd/k;

    .line 5
    .line 6
    iput-object p2, p0, Lvd/p;->b:Lvd/p;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(LYf/B;Lmd/b0;)Lmd/i;
    .locals 1

    .line 1
    iget-object v0, p0, Lvd/p;->b:Lvd/p;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lvd/p;->a(LYf/B;Lmd/b0;)Lmd/i;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    new-instance p2, Lvd/n;

    .line 10
    .line 11
    invoke-direct {p2, p0, p1}, Lvd/n;-><init>(Lvd/p;Lmd/i;)V

    .line 12
    .line 13
    .line 14
    return-object p2

    .line 15
    :cond_0
    new-instance p1, Lvd/o;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lvd/o;-><init>(Lvd/p;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method
