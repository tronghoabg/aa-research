.class public final Lud/f;
.super Lmd/x;
.source "SourceFile"


# instance fields
.field public final a:Lmd/f;

.field public final synthetic b:Lud/g;


# direct methods
.method public constructor <init>(Lud/g;Lmd/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lud/f;->b:Lud/g;

    .line 5
    .line 6
    iput-object p2, p0, Lud/f;->a:Lmd/f;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final e(Lmd/e;Lmd/b0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lud/f;->b:Lud/g;

    .line 2
    .line 3
    iget-object v0, v0, Lud/g;->a:Lmd/b0;

    .line 4
    .line 5
    invoke-virtual {p2, v0}, Lmd/b0;->d(Lmd/b0;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lmd/x;->e(Lmd/e;Lmd/b0;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final f()Lmd/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lud/f;->a:Lmd/f;

    .line 2
    .line 3
    return-object v0
.end method
