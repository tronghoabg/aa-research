.class public final LVa/t7;
.super LVa/xa;
.source "SourceFile"


# instance fields
.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Z

.field public final synthetic e:Ljava/util/ArrayList;

.field public final synthetic f:LVa/Ra;


# direct methods
.method public constructor <init>(LVa/Ra;Ljava/lang/String;ZLjava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LVa/t7;->f:LVa/Ra;

    .line 5
    .line 6
    iput-object p2, p0, LVa/t7;->c:Ljava/lang/String;

    .line 7
    .line 8
    iput-boolean p3, p0, LVa/t7;->d:Z

    .line 9
    .line 10
    iput-object p4, p0, LVa/t7;->e:Ljava/util/ArrayList;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final c()V
    .locals 5

    .line 1
    iget-object v0, p0, LVa/t7;->f:LVa/Ra;

    .line 2
    .line 3
    iget-object v0, v0, LVa/Ra;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, LVa/y7;

    .line 6
    .line 7
    iget-boolean v1, p0, LVa/t7;->d:Z

    .line 8
    .line 9
    iget-object v2, p0, LVa/t7;->e:Ljava/util/ArrayList;

    .line 10
    .line 11
    iget-object v3, p0, LVa/t7;->c:Ljava/lang/String;

    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    invoke-static {v0, v3, v4, v1, v2}, LVa/y7;->s(LVa/y7;Ljava/lang/String;ZZLjava/util/List;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
