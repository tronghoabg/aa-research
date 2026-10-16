.class public final LA7/M1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/util/HashMap;

.field public final c:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LA7/M1;->a:Ljava/lang/String;

    .line 3
    iput p2, p0, LA7/M1;->c:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/HashMap;I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, LA7/M1;->a:Ljava/lang/String;

    .line 6
    iput-object p2, p0, LA7/M1;->b:Ljava/util/HashMap;

    .line 7
    iput p3, p0, LA7/M1;->c:I

    return-void
.end method
