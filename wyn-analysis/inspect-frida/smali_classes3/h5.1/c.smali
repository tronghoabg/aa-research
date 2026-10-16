.class public final Lh5/c;
.super LU8/v0;
.source "SourceFile"


# instance fields
.field public final a:Lg5/f;

.field public final b:Luc/q;

.field public final c:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Luc/q;Lg5/f;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lh5/c;->b:Luc/q;

    .line 5
    .line 6
    iput-object p2, p0, Lh5/c;->a:Lg5/f;

    .line 7
    .line 8
    iput-object p3, p0, Lh5/c;->c:Ljava/lang/Boolean;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public final L()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/c;->c:Ljava/lang/Boolean;

    .line 2
    .line 3
    return-object v0
.end method

.method public final N()Lg5/f;
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/c;->a:Lg5/f;

    .line 2
    .line 3
    return-object v0
.end method

.method public final a(Ljava/util/HashMap;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lh5/c;->b:Luc/q;

    .line 2
    .line 3
    const-string v1, "sqlite_error"

    .line 4
    .line 5
    invoke-interface {v0, v1, p2, p1}, Luc/q;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final b(Ljava/io/Serializable;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lh5/c;->b:Luc/q;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Luc/q;->a(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
