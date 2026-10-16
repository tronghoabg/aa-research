.class public final LW1/d;
.super Landroid/database/ContentObserver;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/ContentResolver;

.field public final b:Landroid/net/Uri;

.field public final synthetic c:LJ9/o;


# direct methods
.method public constructor <init>(LJ9/o;Landroid/os/Handler;Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 0

    .line 1
    iput-object p1, p0, LW1/d;->c:LJ9/o;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 4
    .line 5
    .line 6
    iput-object p3, p0, LW1/d;->a:Landroid/content/ContentResolver;

    .line 7
    .line 8
    iput-object p4, p0, LW1/d;->b:Landroid/net/Uri;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onChange(Z)V
    .locals 3

    .line 1
    iget-object p1, p0, LW1/d;->c:LJ9/o;

    .line 2
    .line 3
    iget-object v0, p1, LJ9/o;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p1, LJ9/o;->j:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, LN1/c;

    .line 10
    .line 11
    iget-object v2, p1, LJ9/o;->i:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, LY9/c;

    .line 14
    .line 15
    invoke-static {v0, v1, v2}, LW1/b;->b(Landroid/content/Context;LN1/c;LY9/c;)LW1/b;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {p1, v0}, LJ9/o;->g(LW1/b;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
