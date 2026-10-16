.class public final LVa/Ma;
.super LVa/Oa;
.source "SourceFile"


# instance fields
.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-direct {p0, v0, p1, p2}, LVa/Oa;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 3
    .line 4
    .line 5
    iput-object p3, p0, LVa/Ma;->j:Ljava/lang/String;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, LVa/Ma;->j:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LVa/Pa;->f(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
