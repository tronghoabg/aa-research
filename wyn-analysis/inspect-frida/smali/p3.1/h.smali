.class public final Lp3/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo3/d;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:LN2/j;

.field public final d:Z

.field public final e:Z

.field public final f:Lef/p;

.field public g:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;LN2/j;ZZ)V
    .locals 1

    .line 1
    const-string v0, "callback"

    .line 2
    .line 3
    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lp3/h;->a:Landroid/content/Context;

    .line 10
    .line 11
    iput-object p2, p0, Lp3/h;->b:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p3, p0, Lp3/h;->c:LN2/j;

    .line 14
    .line 15
    iput-boolean p4, p0, Lp3/h;->d:Z

    .line 16
    .line 17
    iput-boolean p5, p0, Lp3/h;->e:Z

    .line 18
    .line 19
    new-instance p1, Lp3/c;

    .line 20
    .line 21
    const/4 p2, 0x0

    .line 22
    invoke-direct {p1, p0, p2}, Lp3/c;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, LFe/c;->z(Ltf/a;)Lef/p;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lp3/h;->f:Lef/p;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final I()Lo3/a;
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/h;->f:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lp3/g;

    .line 8
    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {v0, v1}, Lp3/g;->a(Z)Lo3/a;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0
.end method

.method public final close()V
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/h;->f:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->isInitialized()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lp3/g;

    .line 14
    .line 15
    invoke-virtual {v0}, Lp3/g;->close()V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public final setWriteAheadLoggingEnabled(Z)V
    .locals 2

    .line 1
    iget-object v0, p0, Lp3/h;->f:Lef/p;

    .line 2
    .line 3
    invoke-virtual {v0}, Lef/p;->isInitialized()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lef/p;->getValue()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Lp3/g;

    .line 14
    .line 15
    invoke-virtual {v0, p1}, Landroid/database/sqlite/SQLiteOpenHelper;->setWriteAheadLoggingEnabled(Z)V

    .line 16
    .line 17
    .line 18
    :cond_0
    iput-boolean p1, p0, Lp3/h;->g:Z

    .line 19
    .line 20
    return-void
.end method
