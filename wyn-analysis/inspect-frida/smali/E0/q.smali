.class public final LE0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LN/K0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Z)V
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, LE0/q;->a:Ljava/lang/Object;

    .line 10
    .line 11
    iput-boolean p2, p0, LE0/q;->b:Z

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final getValue()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE0/q;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
