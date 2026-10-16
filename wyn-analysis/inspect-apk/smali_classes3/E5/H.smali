.class public final LE5/H;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LE5/j0;


# instance fields
.field public final a:Ljava/lang/Object;

.field public b:LE5/J0;


# direct methods
.method public constructor <init>(Ljava/lang/Object;LE5/J0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LE5/H;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, LE5/H;->b:LE5/J0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()LE5/J0;
    .locals 1

    .line 1
    iget-object v0, p0, LE5/H;->b:LE5/J0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getUid()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, LE5/H;->a:Ljava/lang/Object;

    .line 2
    .line 3
    return-object v0
.end method
